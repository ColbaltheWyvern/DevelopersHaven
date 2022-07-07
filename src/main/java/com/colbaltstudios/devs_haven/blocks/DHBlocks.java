package com.colbaltstudios.devs_haven.blocks;

import com.colbaltstudios.devs_haven.DevelopersHaven;
import com.colbaltstudios.devs_haven.util.DHRegistration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class DHBlocks {



    public static void register() { }


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = DHRegistration.BLOCKS.register(name, block);
        DHRegistration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(DevelopersHaven.Developers_Haven)));
        return toReturn;
    }
}
