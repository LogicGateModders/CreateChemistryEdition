package com.gfortes.createchemedit.Block;

import com.gfortes.createchemedit.ChemEditMain;
import com.gfortes.createchemedit.Item.modItems;
import com.gfortes.createchemedit.Other.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemEditMain.MOD_ID);
    private static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block,CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registryBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return modItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> TEST_BLOCK = registryBlock("test_block",() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CHEMEDIT_TAB);
}
