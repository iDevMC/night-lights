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
	public static final BlockItemId FROG_BLUE  = create("frog_blue");
	public static final BlockItemId FROG_BROWN = create("frog_brown");
	public static final BlockItemId FROG_CYAN = create("frog_cyan");
	public static final BlockItemId FROG_GRAY = create("frog_gray");
	public static final BlockItemId FROG_GREEN = create("frog_green");
	public static final BlockItemId FROG_LIGHT_BLUE = create("frog_light_blue");
	public static final BlockItemId FROG_LIGHT_GRAY = create("frog_light_gray");
	public static final BlockItemId FROG_LIME = create("frog_lime");
	public static final BlockItemId FROG_MAGENTA = create("frog_magenta");
	public static final BlockItemId FROG_ORANGE = create("frog_orange");
	public static final BlockItemId FROG_PINK = create("frog_pink");
	public static final BlockItemId FROG_PURPLE = create("frog_purple");
	public static final BlockItemId FROG_RED = create("frog_red");
	public static final BlockItemId FROG_WHITE = create("frog_white");
	public static final BlockItemId FROG_YELLOW = create("frog_yellow");
	
	public static final BlockItemId MUSHROOM_BLACK = create("mushroom_black");
	public static final BlockItemId MUSHROOM_BLUE = create("mushroom_blue");
	public static final BlockItemId MUSHROOM_BROWN = create("mushroom_brown");
	public static final BlockItemId MUSHROOM_CYAN = create("mushroom_cyan");
	public static final BlockItemId MUSHROOM_GRAY = create("mushroom_gray");
	public static final BlockItemId MUSHROOM_GREEN = create("mushroom_green");
	public static final BlockItemId MUSHROOM_LIGHT_BLUE = create("mushroom_light_blue");
	public static final BlockItemId MUSHROOM_LIGHT_GRAY = create("mushroom_light_gray");
	public static final BlockItemId MUSHROOM_LIME = create("mushroom_lime");
	public static final BlockItemId MUSHROOM_MAGENTA = create("mushroom_magenta");
	public static final BlockItemId MUSHROOM_ORANGE = create("mushroom_orange");
	public static final BlockItemId MUSHROOM_PINK = create("mushroom_pink");
	public static final BlockItemId MUSHROOM_PURPLE = create("mushroom_purple");
	public static final BlockItemId MUSHROOM_RED = create("mushroom_red");
	public static final BlockItemId MUSHROOM_WHITE = create("mushroom_white");
	public static final BlockItemId MUSHROOM_YELLOW = create("mushroom_yellow");

	public static final BlockItemId FAIRY_LIGHTS_BLACK = create("fairy_lights_black");
	public static final BlockItemId FAIRY_LIGHTS_BLUE = create("fairy_lights_blue");
	public static final BlockItemId FAIRY_LIGHTS_BROWN = create("fairy_lights_brown");
	public static final BlockItemId FAIRY_LIGHTS_CYAN = create("fairy_lights_cyan");
	public static final BlockItemId FAIRY_LIGHTS_GRAY = create("fairy_lights_gray");
	public static final BlockItemId FAIRY_LIGHTS_GREEN = create("fairy_lights_green");
	public static final BlockItemId FAIRY_LIGHTS_LIGHT_BLUE = create("fairy_lights_light_blue");
	public static final BlockItemId FAIRY_LIGHTS_LIGHT_GRAY = create("fairy_lights_light_gray");
	public static final BlockItemId FAIRY_LIGHTS_LIME = create("fairy_lights_lime");
	public static final BlockItemId FAIRY_LIGHTS_MAGENTA = create("fairy_lights_magenta");
	public static final BlockItemId FAIRY_LIGHTS_ORANGE = create("fairy_lights_orange");
	public static final BlockItemId FAIRY_LIGHTS_PINK = create("fairy_lights_pink");
	public static final BlockItemId FAIRY_LIGHTS_PURPLE = create("fairy_lights_purple");
	public static final BlockItemId FAIRY_LIGHTS_RED = create("fairy_lights_red");
	public static final BlockItemId FAIRY_LIGHTS_WHITE = create("fairy_lights_white");
	public static final BlockItemId FAIRY_LIGHTS_YELLOW = create("fairy_lights_yellow");

	public static final BlockItemId HANGING_LIGHTS_BLACK = create("hanging_lights_black");
	public static final BlockItemId HANGING_LIGHTS_BLUE = create("hanging_lights_blue");
	public static final BlockItemId HANGING_LIGHTS_BROWN = create("hanging_lights_brown");
	public static final BlockItemId HANGING_LIGHTS_CYAN = create("hanging_lights_cyan");
	public static final BlockItemId HANGING_LIGHTS_GRAY = create("hanging_lights_gray");
	public static final BlockItemId HANGING_LIGHTS_GREEN = create("hanging_lights_green");
	public static final BlockItemId HANGING_LIGHTS_LIGHT_BLUE = create("hanging_lights_light_blue");
	public static final BlockItemId HANGING_LIGHTS_LIGHT_GRAY = create("hanging_lights_light_gray");
	public static final BlockItemId HANGING_LIGHTS_LIME = create("hanging_lights_lime");
	public static final BlockItemId HANGING_LIGHTS_MAGENTA = create("hanging_lights_magenta");
	public static final BlockItemId HANGING_LIGHTS_ORANGE = create("hanging_lights_orange");
	public static final BlockItemId HANGING_LIGHTS_PINK = create("hanging_lights_pink");
	public static final BlockItemId HANGING_LIGHTS_PURPLE = create("hanging_lights_purple");
	public static final BlockItemId HANGING_LIGHTS_RED = create("hanging_lights_red");
	public static final BlockItemId HANGING_LIGHTS_WHITE = create("hanging_lights_white");
	public static final BlockItemId HANGING_LIGHTS_YELLOW = create("hanging_lights_yellow");

	public static final BlockItemId OCTOPUS_BLACK = create("octopus_black");
	public static final BlockItemId OCTOPUS_BLUE = create("octopus_blue");
	public static final BlockItemId OCTOPUS_BROWN = create("octopus_brown");
	public static final BlockItemId OCTOPUS_CYAN = create("octopus_cyan");
	public static final BlockItemId OCTOPUS_GRAY = create("octopus_gray");
	public static final BlockItemId OCTOPUS_GREEN = create("octopus_green");
	public static final BlockItemId OCTOPUS_LIGHT_BLUE = create("octopus_light_blue");
	public static final BlockItemId OCTOPUS_LIGHT_GRAY = create("octopus_light_gray");
	public static final BlockItemId OCTOPUS_LIME = create("octopus_lime");
	public static final BlockItemId OCTOPUS_MAGENTA = create("octopus_magenta");
	public static final BlockItemId OCTOPUS_ORANGE = create("octopus_orange");
	public static final BlockItemId OCTOPUS_PINK = create("octopus_pink");
	public static final BlockItemId OCTOPUS_PURPLE = create("octopus_purple");
	public static final BlockItemId OCTOPUS_RED = create("octopus_red");
	public static final BlockItemId OCTOPUS_WHITE = create("octopus_white");
	public static final BlockItemId OCTOPUS_YELLOW = create("octopus_yellow");

}