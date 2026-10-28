package com.samgj15.nightlights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Nightlight implements ModInitializer {

	public static Nightlight INSTANCE;

	public static final String MOD_ID = "nightlights";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private CreativeModeTab tab;
	public CreativeModeTab tab() { return tab; }

	@Override public void onInitialize() {

		INSTANCE = this;

		NightlightBlocks.initialize();

		tab = FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(NightlightBlocks.FROG_BLACK))
			.title(Component.translatable("itemGroup.nightlights"))
			.displayItems((_, b) -> {
				NightlightBlocks.BLOCKS.forEach(bl -> b.accept(bl));
			})
			.build();

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, NightlightKeys.NL_CREATIVE_TAB, tab);

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

}