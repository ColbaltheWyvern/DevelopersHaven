package com.colbaltstudios.devs_haven.events;

import com.colbaltstudios.devs_haven.item.DHItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.world.BlockEvent;

public class DHEvents {

    public void destroyBlock(BlockEvent.BreakEvent event) {
        if(event.getPlayer().getHeldItemMainhand().getItem() == DHItems.FAR_DESTROYER.get()) {

            double x = Minecraft.getInstance().player.getLookVec().x;
            double y = Minecraft.getInstance().player.getLookVec().y;
            double z = Minecraft.getInstance().player.getLookVec().z;



        }

    }

}
