package com.samgj15.nightlights;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

import com.samgj15.nightlights.block.CeilingBlock;
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

	public static List<Block> BLOCKS = new CopyOnWriteArrayList<>();

	private static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
		Block block = blockFactory.apply(properties.setId(id));
		return Registry.register(BuiltInRegistries.BLOCK, id, block);
	}

	private static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
		Block block = register(id.block(), blockFactory, properties);
		BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
		Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);
		BLOCKS.add(block);
		return block;
	}

	public static final Block FROG_BLACK = register(
		NightlightKeys.FROG_BLACK,
		NightlightBlock::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noOcclusion().lightLevel(s -> s.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GRASS)
	);

	public static final Block FROG_BLUE = makeFrog(NightlightKeys.FROG_BLUE);
	public static final Block FROG_BROWN = makeFrog(NightlightKeys.FROG_BROWN);
	public static final Block FROG_CYAN = makeFrog(NightlightKeys.FROG_CYAN);
	public static final Block FROG_GRAY = makeFrog(NightlightKeys.FROG_GRAY);
	public static final Block FROG_GREEN = makeFrog(NightlightKeys.FROG_GREEN);
	public static final Block FROG_LIGHT_BLUE = makeFrog(NightlightKeys.FROG_LIGHT_BLUE);
	public static final Block FROG_LIGHT_GRAY = makeFrog(NightlightKeys.FROG_LIGHT_GRAY);
	public static final Block FROG_LIME = makeFrog(NightlightKeys.FROG_LIME);
	public static final Block FROG_MAGENTA = makeFrog(NightlightKeys.FROG_MAGENTA);
	public static final Block FROG_ORANGE = makeFrog(NightlightKeys.FROG_ORANGE);
	public static final Block FROG_PINK = makeFrog(NightlightKeys.FROG_PINK);
	public static final Block FROG_PURPLE = makeFrog(NightlightKeys.FROG_PURPLE);
	public static final Block FROG_RED = makeFrog(NightlightKeys.FROG_RED);
	public static final Block FROG_WHITE = makeFrog(NightlightKeys.FROG_WHITE);
	public static final Block FROG_YELLOW = makeFrog(NightlightKeys.FROG_YELLOW);

	public static final Block MUSHROOM_BLACK = register(
		NightlightKeys.MUSHROOM_BLACK,
		NightlightBlock::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noOcclusion().lightLevel(s -> s.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GRASS)
	);

	public static final Block MUSHROOM_BLUE = makeMushroom(NightlightKeys.MUSHROOM_BLUE);
	public static final Block MUSHROOM_BROWN = makeMushroom(NightlightKeys.MUSHROOM_BROWN);
	public static final Block MUSHROOM_CYAN = makeMushroom(NightlightKeys.MUSHROOM_CYAN);
	public static final Block MUSHROOM_GRAY = makeMushroom(NightlightKeys.MUSHROOM_GRAY);
	public static final Block MUSHROOM_GREEN = makeMushroom(NightlightKeys.MUSHROOM_GREEN);
	public static final Block MUSHROOM_LIGHT_BLUE = makeMushroom(NightlightKeys.MUSHROOM_LIGHT_BLUE);
	public static final Block MUSHROOM_LIGHT_GRAY = makeMushroom(NightlightKeys.MUSHROOM_LIGHT_GRAY);
	public static final Block MUSHROOM_LIME = makeMushroom(NightlightKeys.MUSHROOM_LIME);
	public static final Block MUSHROOM_MAGENTA = makeMushroom(NightlightKeys.MUSHROOM_MAGENTA);
	public static final Block MUSHROOM_ORANGE = makeMushroom(NightlightKeys.MUSHROOM_ORANGE);
	public static final Block MUSHROOM_PINK = makeMushroom(NightlightKeys.MUSHROOM_PINK);
	public static final Block MUSHROOM_PURPLE = makeMushroom(NightlightKeys.MUSHROOM_PURPLE);
	public static final Block MUSHROOM_RED = makeMushroom(NightlightKeys.MUSHROOM_RED);
	public static final Block MUSHROOM_WHITE = makeMushroom(NightlightKeys.MUSHROOM_WHITE);
	public static final Block MUSHROOM_YELLOW = makeMushroom(NightlightKeys.MUSHROOM_YELLOW);

	public static final Block OCTOPUS_BLACK = register(
		NightlightKeys.OCTOPUS_BLACK,
		NightlightBlock::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noOcclusion().lightLevel(s -> s.getValue(NightlightBlock.CLICKED) ? 8 : 0).sound(SoundType.GRASS)
	);

	public static final Block OCTOPUS_BLUE = makeOctopus(NightlightKeys.OCTOPUS_BLUE);
	public static final Block OCTOPUS_BROWN = makeOctopus(NightlightKeys.OCTOPUS_BROWN);
	public static final Block OCTOPUS_CYAN = makeOctopus(NightlightKeys.OCTOPUS_CYAN);
	public static final Block OCTOPUS_GRAY = makeOctopus(NightlightKeys.OCTOPUS_GRAY);
	public static final Block OCTOPUS_GREEN = makeOctopus(NightlightKeys.OCTOPUS_GREEN);
	public static final Block OCTOPUS_LIGHT_BLUE = makeOctopus(NightlightKeys.OCTOPUS_LIGHT_BLUE);
	public static final Block OCTOPUS_LIGHT_GRAY = makeOctopus(NightlightKeys.OCTOPUS_LIGHT_GRAY);
	public static final Block OCTOPUS_LIME = makeOctopus(NightlightKeys.OCTOPUS_LIME);
	public static final Block OCTOPUS_MAGENTA = makeOctopus(NightlightKeys.OCTOPUS_MAGENTA);
	public static final Block OCTOPUS_ORANGE = makeOctopus(NightlightKeys.OCTOPUS_ORANGE);
	public static final Block OCTOPUS_PINK = makeOctopus(NightlightKeys.OCTOPUS_PINK);
	public static final Block OCTOPUS_PURPLE = makeOctopus(NightlightKeys.OCTOPUS_PURPLE);
	public static final Block OCTOPUS_RED = makeOctopus(NightlightKeys.OCTOPUS_RED);
	public static final Block OCTOPUS_WHITE = makeOctopus(NightlightKeys.OCTOPUS_WHITE);
	public static final Block OCTOPUS_YELLOW = makeOctopus(NightlightKeys.OCTOPUS_YELLOW);
	
	public static final Block FAIRY_LIGHTS_BLACK = register(
		NightlightKeys.FAIRY_LIGHTS_BLACK,
		CeilingBlock::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noOcclusion().instabreak().lightLevel(_ -> 6)
	);
	
	public static final Block FAIRY_LIGHTS_BLUE = makeCeiling(NightlightKeys.FAIRY_LIGHTS_BLUE);
	public static final Block FAIRY_LIGHTS_BROWN = makeCeiling(NightlightKeys.FAIRY_LIGHTS_BROWN);
	public static final Block FAIRY_LIGHTS_CYAN = makeCeiling(NightlightKeys.FAIRY_LIGHTS_CYAN);
	public static final Block FAIRY_LIGHTS_GRAY = makeCeiling(NightlightKeys.FAIRY_LIGHTS_GRAY);
	public static final Block FAIRY_LIGHTS_GREEN = makeCeiling(NightlightKeys.FAIRY_LIGHTS_GREEN);
	public static final Block FAIRY_LIGHTS_LIGHT_BLUE = makeCeiling(NightlightKeys.FAIRY_LIGHTS_LIGHT_BLUE);
	public static final Block FAIRY_LIGHTS_LIGHT_GRAY = makeCeiling(NightlightKeys.FAIRY_LIGHTS_LIGHT_GRAY);
	public static final Block FAIRY_LIGHTS_LIME = makeCeiling(NightlightKeys.FAIRY_LIGHTS_LIME);
	public static final Block FAIRY_LIGHTS_MAGENTA = makeCeiling(NightlightKeys.FAIRY_LIGHTS_MAGENTA);
	public static final Block FAIRY_LIGHTS_ORANGE = makeCeiling(NightlightKeys.FAIRY_LIGHTS_ORANGE);
	public static final Block FAIRY_LIGHTS_PINK = makeCeiling(NightlightKeys.FAIRY_LIGHTS_PINK);
	public static final Block FAIRY_LIGHTS_PURPLE = makeCeiling(NightlightKeys.FAIRY_LIGHTS_PURPLE);
	public static final Block FAIRY_LIGHTS_RED = makeCeiling(NightlightKeys.FAIRY_LIGHTS_RED);
	public static final Block FAIRY_LIGHTS_WHITE = makeCeiling(NightlightKeys.FAIRY_LIGHTS_WHITE);
	public static final Block FAIRY_LIGHTS_YELLOW = makeCeiling(NightlightKeys.FAIRY_LIGHTS_YELLOW);
	public static final Block FAIRY_LIGHTS_DEFAULT = makeCeiling(NightlightKeys.FAIRY_LIGHTS_DEFAULT);
	
	public static final Block HANGING_LIGHTS_BLACK = makeCeiling(NightlightKeys.HANGING_LIGHTS_BLACK);
	public static final Block HANGING_LIGHTS_BLUE = makeCeiling(NightlightKeys.HANGING_LIGHTS_BLUE);
	public static final Block HANGING_LIGHTS_BROWN = makeCeiling(NightlightKeys.HANGING_LIGHTS_BROWN);
	public static final Block HANGING_LIGHTS_CYAN = makeCeiling(NightlightKeys.HANGING_LIGHTS_CYAN);
	public static final Block HANGING_LIGHTS_GRAY = makeCeiling(NightlightKeys.HANGING_LIGHTS_GRAY);
	public static final Block HANGING_LIGHTS_GREEN = makeCeiling(NightlightKeys.HANGING_LIGHTS_GREEN);
	public static final Block HANGING_LIGHTS_LIGHT_BLUE = makeCeiling(NightlightKeys.HANGING_LIGHTS_LIGHT_BLUE);
	public static final Block HANGING_LIGHTS_LIGHT_GRAY = makeCeiling(NightlightKeys.HANGING_LIGHTS_LIGHT_GRAY);
	public static final Block HANGING_LIGHTS_LIME = makeCeiling(NightlightKeys.HANGING_LIGHTS_LIME);
	public static final Block HANGING_LIGHTS_MAGENTA = makeCeiling(NightlightKeys.HANGING_LIGHTS_MAGENTA);
	public static final Block HANGING_LIGHTS_ORANGE = makeCeiling(NightlightKeys.HANGING_LIGHTS_ORANGE);
	public static final Block HANGING_LIGHTS_PINK = makeCeiling(NightlightKeys.HANGING_LIGHTS_PINK);
	public static final Block HANGING_LIGHTS_PURPLE = makeCeiling(NightlightKeys.HANGING_LIGHTS_PURPLE);
	public static final Block HANGING_LIGHTS_RED = makeCeiling(NightlightKeys.HANGING_LIGHTS_RED);
	public static final Block HANGING_LIGHTS_WHITE = makeCeiling(NightlightKeys.HANGING_LIGHTS_WHITE);
	public static final Block HANGING_LIGHTS_YELLOW = makeCeiling(NightlightKeys.HANGING_LIGHTS_YELLOW);
	public static final Block HANGING_LIGHTS_DEFAULT = makeCeiling(NightlightKeys.HANGING_LIGHTS_DEFAULT);

	private static final Block makeNightlightBlock(BlockItemId key, Block parent) {
		var block = register(key, NightlightBlock::new, BlockBehaviour.Properties.ofFullCopy(parent));
		return block;
	}
	
	private static final Block makeCeilingBlock(BlockItemId key, Block parent) {
		return register(key, CeilingBlock::new, BlockBehaviour.Properties.ofFullCopy(parent));
	}

	private static final Block makeFrog(BlockItemId key) { return makeNightlightBlock(key, FROG_BLACK); }
	private static final Block makeMushroom(BlockItemId key) { return makeNightlightBlock(key, MUSHROOM_BLACK); }
	private static final Block makeOctopus(BlockItemId key) { return makeNightlightBlock(key, OCTOPUS_BLACK); }
	private static final Block makeCeiling(BlockItemId key) { return makeCeilingBlock(key, FAIRY_LIGHTS_BLACK); }

}