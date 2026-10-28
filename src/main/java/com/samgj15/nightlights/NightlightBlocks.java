package com.samgj15.nightlights;

import java.util.function.Function;

import com.samgj15.nightlights.block.NightlightBlock;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class NightlightBlocks {
	
	public static void initialize() {}

	private static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
		Block block = blockFactory.apply(properties.setId(id));
		return Registry.register(BuiltInRegistries.BLOCK, id, block);
	}

	private static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
		Block block = register(id.block(), blockFactory, properties);
		BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
		Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);
		return block;
	}
	
	public static final Block FROG_BLACK = register(
		NightlightKeys.FROG_BLACK,
		NightlightBlock::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noOcclusion().lightLevel(s -> s.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GRASS)
	);
	
//	public static final Block FROG_BLACK = register("frog_black", () -> new NightlightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
//    public static final RegistryObject<Block> FROG_BLUE = BLOCKS.register("frog_blue", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_BROWN = BLOCKS.register("frog_brown", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_CYAN = BLOCKS.register("frog_cyan", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_GRAY = BLOCKS.register("frog_gray", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_GREEN = BLOCKS.register("frog_green", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_LIGHT_BLUE = BLOCKS.register("frog_light_blue", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_LIGHT_GRAY = BLOCKS.register("frog_light_gray", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_LIME = BLOCKS.register("frog_lime", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_MAGENTA = BLOCKS.register("frog_magenta", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_ORANGE = BLOCKS.register("frog_orange", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_PINK = BLOCKS.register("frog_pink", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_PURPLE = BLOCKS.register("frog_purple", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_RED = BLOCKS.register("frog_red", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_WHITE = BLOCKS.register("frog_white", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    public static final RegistryObject<Block> FROG_YELLOW = BLOCKS.register("frog_yellow", () -> new NightlightBlock(Block.Properties.copy(FROG_BLACK.get())));
//    
//    public static final RegistryObject<Block> MUSHROOM_BLACK = BLOCKS.register("mushroom_black", () -> new NightlightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
//    public static final RegistryObject<Block> MUSHROOM_BLUE = BLOCKS.register("mushroom_blue", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_BROWN = BLOCKS.register("mushroom_brown", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_CYAN = BLOCKS.register("mushroom_cyan", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_GRAY = BLOCKS.register("mushroom_gray", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_GREEN = BLOCKS.register("mushroom_green", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_LIGHT_BLUE = BLOCKS.register("mushroom_light_blue", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_LIGHT_GRAY = BLOCKS.register("mushroom_light_gray", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_LIME = BLOCKS.register("mushroom_lime", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_MAGENTA = BLOCKS.register("mushroom_magenta", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_ORANGE = BLOCKS.register("mushroom_orange", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_PINK = BLOCKS.register("mushroom_pink", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_PURPLE = BLOCKS.register("mushroom_purple", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_RED = BLOCKS.register("mushroom_red", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_WHITE = BLOCKS.register("mushroom_white", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    public static final RegistryObject<Block> MUSHROOM_YELLOW = BLOCKS.register("mushroom_yellow", () -> new NightlightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
//    
//    public static final RegistryObject<Block> OCTOPUS_BLACK = BLOCKS.register("octopus_black", () -> new NightlightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
//    public static final RegistryObject<Block> OCTOPUS_BLUE = BLOCKS.register("octopus_blue", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_BROWN = BLOCKS.register("octopus_brown", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_CYAN = BLOCKS.register("octopus_cyan", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_GRAY = BLOCKS.register("octopus_gray", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_GREEN = BLOCKS.register("octopus_green", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_LIGHT_BLUE = BLOCKS.register("octopus_light_blue", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_LIGHT_GRAY = BLOCKS.register("octopus_light_gray", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_LIME = BLOCKS.register("octopus_lime", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_MAGENTA = BLOCKS.register("octopus_magenta", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_ORANGE = BLOCKS.register("octopus_orange", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_PINK = BLOCKS.register("octopus_pink", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_PURPLE = BLOCKS.register("octopus_purple", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_RED = BLOCKS.register("octopus_red", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_WHITE = BLOCKS.register("octopus_white", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
//    public static final RegistryObject<Block> OCTOPUS_YELLOW = BLOCKS.register("octopus_yellow", () -> new NightlightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));

}