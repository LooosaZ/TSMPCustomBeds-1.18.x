package net.loosaz.tcustombeds.items;

import net.loosaz.tcustombeds.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TCUSTOMBEDS_TAB = new CreativeModeTab("tcustombedstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.EGG_BED.get());
        }
    };
}