package com.samgj15.nightlights;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

public class NightlightKeys {

	public static final ResourceKey<CreativeModeTab> NL_CREATIVE_TAB = ResourceKey.create(
		BuiltInRegistries.CREATIVE_MODE_TAB.key(), Nightlight.id("creative_tab")
	);
	
	
	private static BlockItemId create(String name) {
		Identifier id = Nightlight.id(name);
		return BlockItemId.create(id, id);
	}
	
	public static final BlockItemId FROG_BLACK = create("frog_black");
	
}