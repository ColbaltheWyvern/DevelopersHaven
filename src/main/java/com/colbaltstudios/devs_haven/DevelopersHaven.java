package com.colbaltstudios.devs_haven;

import com.colbaltstudios.devs_haven.blocks.DHBlocks;
import com.colbaltstudios.devs_haven.events.DHEvents;
import com.colbaltstudios.devs_haven.item.DHItems;
import com.colbaltstudios.devs_haven.util.DHRegistration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DevelopersHaven.MOD_ID)
public class DevelopersHaven
{
    public static final String MOD_ID = "devs_haven";

    public static final ItemGroup Developers_Haven = new ItemGroup(DevelopersHaven.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(DHBlocks);
        }
    };

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public DevelopersHaven() {

        DHRegistration.register();
        DHItems.register();
        DHBlocks.register();

        MinecraftForge.EVENT_BUS.register(new DHEvents());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
