
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.compressedgrass.item.TripleCompressedGrassItem;
import net.mcreator.compressedgrass.item.SextupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.SeptupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.QuintupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.QuadrupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.OctupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.NonupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.DoubleCompressedGrassItem;
import net.mcreator.compressedgrass.item.CompressedGrassItem;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModItems {
	public static Item COMPRESSED_GRASS;
	public static Item DOUBLE_COMPRESSED_GRASS;
	public static Item TRIPLE_COMPRESSED_GRASS;
	public static Item QUADRUPLE_COMPRESSED_GRASS;
	public static Item QUINTUPLE_COMPRESSED_GRASS;
	public static Item SEXTUPLE_COMPRESSED_GRASS;
	public static Item SEPTUPLE_COMPRESSED_GRASS;
	public static Item OCTUPLE_COMPRESSED_GRASS;
	public static Item NONUPLE_COMPRESSED_GRASS;

	public static void load() {
		COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "compressed_grass"),
				new CompressedGrassItem());
		DOUBLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "double_compressed_grass"),
				new DoubleCompressedGrassItem());
		TRIPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "triple_compressed_grass"),
				new TripleCompressedGrassItem());
		QUADRUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "quadruple_compressed_grass"),
				new QuadrupleCompressedGrassItem());
		QUINTUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "quintuple_compressed_grass"),
				new QuintupleCompressedGrassItem());
		SEXTUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "sextuple_compressed_grass"),
				new SextupleCompressedGrassItem());
		SEPTUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "septuple_compressed_grass"),
				new SeptupleCompressedGrassItem());
		OCTUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "octuple_compressed_grass"),
				new OctupleCompressedGrassItem());
		NONUPLE_COMPRESSED_GRASS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "nonuple_compressed_grass"),
				new NonupleCompressedGrassItem());
	}
}
