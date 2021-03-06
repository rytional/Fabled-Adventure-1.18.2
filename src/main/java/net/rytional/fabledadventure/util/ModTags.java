package net.rytional.fabledadventure.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rytional.fabledadventure.FabledAdventure;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> PAXEL_MINEABLE = createTag("mineable/paxel");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(FabledAdventure.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(FabledAdventure.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }

    public static class Fluids {

        public static final TagKey<Fluid> MOLTEN_FLUID = createTag("molten_fluid");

        private static TagKey<Fluid> createTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier(FabledAdventure.MOD_ID, name));
        }

        private static TagKey<Fluid> createCommonTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier("c", name));
        }
    }
}
