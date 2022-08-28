package com.gfortes.createchemedit.Other;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.gfortes.createchemedit.Item.modItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab CHEMEDIT_TAB = new CreativeModeTab("chemistrytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(modItems.EMPTY_TEST_TUBE.get());
        }
    };

}
