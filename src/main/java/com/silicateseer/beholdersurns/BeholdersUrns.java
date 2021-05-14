package com.silicateseer.beholdersurns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersUrns implements ModInitializer {
	
	public static final String MODID = "beholdersurns";
	
	public static final Block QUARTZ_URN = register("quartz_urn", 
			new BarrelBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(2.0F, 6.0F)), ItemGroup.DECORATIONS);
	
	@Override
	public void onInitialize() {
		
	}
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
		return item;
	}
}
