
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class CompressedGrassModTabs {
	public static CreativeModeTab TAB_GRASS;

	public static void load() {
		TAB_GRASS = FabricItemGroupBuilder.create(new ResourceLocation("compressed_grass", "grass")).icon(() -> new ItemStack(Blocks.GRASS)).build();
	}
}
