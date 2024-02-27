package net.loosaz.tcustombeds.block;

import net.loosaz.tcustombeds.TCustomBeds;
import net.loosaz.tcustombeds.block.custom.EggBed;
import net.loosaz.tcustombeds.items.ModCreativeModeTab;
import net.loosaz.tcustombeds.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TCustomBeds.MOD_ID);

    public static final RegistryObject<Block> EGG_BED = registerBlock("egg_bed",
            () -> new EggBed(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()), ModCreativeModeTab.TCUSTOMBEDS_TAB);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static final RegistryObject<Block> VEGI_EGG_BED = registerBlock("vegi_egg_bed",
            () -> new EggBed(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()), ModCreativeModeTab.TCUSTOMBEDS_TAB);


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
