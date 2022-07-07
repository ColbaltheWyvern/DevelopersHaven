package com.colbaltstudios.devs_haven.item;

import com.colbaltstudios.devs_haven.DevelopersHaven;
import com.colbaltstudios.devs_haven.util.DHRegistration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class DHItems {

//FAR DESTROYER
public static final RegistryObject<Item> FAR_DESTROYER =
        DHRegistration.ITEMS.register("far_destroyer",
                () -> new Item(new Item.Properties().group(DevelopersHaven.Developers_Haven)));

    public static void register() { }
}
