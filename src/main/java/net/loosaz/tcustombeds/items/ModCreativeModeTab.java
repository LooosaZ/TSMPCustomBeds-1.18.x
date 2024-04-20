package net.loosaz.tcustombeds.items;

import net.loosaz.tcustombeds.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

// Creates a class for the creative mode tab to sort the items
public class ModCreativeModeTab {
    public static final CreativeModeTab TCUSTOMBEDS_TAB = new CreativeModeTab("tcustombedstab") {
        //Override the standard Minecraft icon for the tab, switching it for an egg bed
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.EGG_BED.get());
        }
    };
}
