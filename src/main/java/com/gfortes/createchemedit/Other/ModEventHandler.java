package com.gfortes.createchemedit.Other;

import com.gfortes.createchemedit.ChemEditMain;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.level.Explosion;

@Mod.EventBusSubscriber(modid = ChemEditMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModEventHandler {

    @SubscribeEvent
    public static void SodiumInWater(ItemTossEvent event){
        ItemEntity itemEntity = event.getEntityItem();
        Item item = itemEntity.getItem().getItem();
        System.out.println("DROPED ITEM NAME:"+item.getRegistryName());
        if (item.getRegistryName().toString().equals("createchemedit:sodium") || itemEntity.isInWater()) {
            System.out.println("SODIUM BITCH:" + itemEntity.position().toString());

            //dont work
            Explosion explosion = new Explosion(itemEntity.level,itemEntity,itemEntity.position().x,itemEntity.position().y,itemEntity.position().z,3.0f);
        }
    }

}
