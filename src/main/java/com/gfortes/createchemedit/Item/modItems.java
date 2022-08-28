package com.gfortes.createchemedit.Item;

import com.gfortes.createchemedit.ChemEditMain;
import com.gfortes.createchemedit.Other.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class modItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChemEditMain.MOD_ID);
    public static final RegistryObject<Item> EMPTY_TEST_TUBE = ITEMS.register("empty_test_tube",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEMEDIT_TAB)));
    public static final RegistryObject<Item> SODIUM = ITEMS.register("sodium",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEMEDIT_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
