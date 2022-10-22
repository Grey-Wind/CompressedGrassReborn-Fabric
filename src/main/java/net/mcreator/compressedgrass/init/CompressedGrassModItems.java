
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.compressedgrass.item.TripleCompressedGrassItem;
import net.mcreator.compressedgrass.item.TripleCompressedArmorItem;
import net.mcreator.compressedgrass.item.SextupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.SextupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.SeptupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.SeptupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.QuintupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.QuintupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.QuadrupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.QuadrupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.OctupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.OctupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.NonupleCompressedGrassItem;
import net.mcreator.compressedgrass.item.NonupleCompressedArmorItem;
import net.mcreator.compressedgrass.item.DoubleCompressedGrassItem;
import net.mcreator.compressedgrass.item.DoubleCompressedArmorItem;
import net.mcreator.compressedgrass.item.CompressedGrassItem;
import net.mcreator.compressedgrass.item.CompressedArmorItem;
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
	public static Item COMPRESSED_ARMOR_HELMET;
	public static Item COMPRESSED_ARMOR_CHESTPLATE;
	public static Item COMPRESSED_ARMOR_LEGGINGS;
	public static Item COMPRESSED_ARMOR_BOOTS;
	public static Item DOUBLE_COMPRESSED_ARMOR_HELMET;
	public static Item DOUBLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item DOUBLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item DOUBLE_COMPRESSED_ARMOR_BOOTS;
	public static Item TRIPLE_COMPRESSED_ARMOR_HELMET;
	public static Item TRIPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item TRIPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item TRIPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item QUADRUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item QUADRUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item QUADRUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item QUADRUPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item QUINTUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item QUINTUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item QUINTUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item QUINTUPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item SEXTUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item SEXTUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item SEXTUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item SEXTUPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item SEPTUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item SEPTUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item SEPTUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item SEPTUPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item OCTUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item OCTUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item OCTUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item OCTUPLE_COMPRESSED_ARMOR_BOOTS;
	public static Item NONUPLE_COMPRESSED_ARMOR_HELMET;
	public static Item NONUPLE_COMPRESSED_ARMOR_CHESTPLATE;
	public static Item NONUPLE_COMPRESSED_ARMOR_LEGGINGS;
	public static Item NONUPLE_COMPRESSED_ARMOR_BOOTS;

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
		COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "compressed_armor_helmet"),
				new CompressedArmorItem.Helmet());
		COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "compressed_armor_chestplate"),
				new CompressedArmorItem.Chestplate());
		COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "compressed_armor_leggings"),
				new CompressedArmorItem.Leggings());
		COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedGrassMod.MODID, "compressed_armor_boots"),
				new CompressedArmorItem.Boots());
		DOUBLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "double_compressed_armor_helmet"), new DoubleCompressedArmorItem.Helmet());
		DOUBLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "double_compressed_armor_chestplate"), new DoubleCompressedArmorItem.Chestplate());
		DOUBLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "double_compressed_armor_leggings"), new DoubleCompressedArmorItem.Leggings());
		DOUBLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "double_compressed_armor_boots"), new DoubleCompressedArmorItem.Boots());
		TRIPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "triple_compressed_armor_helmet"), new TripleCompressedArmorItem.Helmet());
		TRIPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "triple_compressed_armor_chestplate"), new TripleCompressedArmorItem.Chestplate());
		TRIPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "triple_compressed_armor_leggings"), new TripleCompressedArmorItem.Leggings());
		TRIPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "triple_compressed_armor_boots"), new TripleCompressedArmorItem.Boots());
		QUADRUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quadruple_compressed_armor_helmet"), new QuadrupleCompressedArmorItem.Helmet());
		QUADRUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quadruple_compressed_armor_chestplate"),
				new QuadrupleCompressedArmorItem.Chestplate());
		QUADRUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quadruple_compressed_armor_leggings"), new QuadrupleCompressedArmorItem.Leggings());
		QUADRUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quadruple_compressed_armor_boots"), new QuadrupleCompressedArmorItem.Boots());
		QUINTUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quintuple_compressed_armor_helmet"), new QuintupleCompressedArmorItem.Helmet());
		QUINTUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quintuple_compressed_armor_chestplate"),
				new QuintupleCompressedArmorItem.Chestplate());
		QUINTUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quintuple_compressed_armor_leggings"), new QuintupleCompressedArmorItem.Leggings());
		QUINTUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "quintuple_compressed_armor_boots"), new QuintupleCompressedArmorItem.Boots());
		SEXTUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "sextuple_compressed_armor_helmet"), new SextupleCompressedArmorItem.Helmet());
		SEXTUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "sextuple_compressed_armor_chestplate"), new SextupleCompressedArmorItem.Chestplate());
		SEXTUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "sextuple_compressed_armor_leggings"), new SextupleCompressedArmorItem.Leggings());
		SEXTUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "sextuple_compressed_armor_boots"), new SextupleCompressedArmorItem.Boots());
		SEPTUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "septuple_compressed_armor_helmet"), new SeptupleCompressedArmorItem.Helmet());
		SEPTUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "septuple_compressed_armor_chestplate"), new SeptupleCompressedArmorItem.Chestplate());
		SEPTUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "septuple_compressed_armor_leggings"), new SeptupleCompressedArmorItem.Leggings());
		SEPTUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "septuple_compressed_armor_boots"), new SeptupleCompressedArmorItem.Boots());
		OCTUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "octuple_compressed_armor_helmet"), new OctupleCompressedArmorItem.Helmet());
		OCTUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "octuple_compressed_armor_chestplate"), new OctupleCompressedArmorItem.Chestplate());
		OCTUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "octuple_compressed_armor_leggings"), new OctupleCompressedArmorItem.Leggings());
		OCTUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "octuple_compressed_armor_boots"), new OctupleCompressedArmorItem.Boots());
		NONUPLE_COMPRESSED_ARMOR_HELMET = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "nonuple_compressed_armor_helmet"), new NonupleCompressedArmorItem.Helmet());
		NONUPLE_COMPRESSED_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "nonuple_compressed_armor_chestplate"), new NonupleCompressedArmorItem.Chestplate());
		NONUPLE_COMPRESSED_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "nonuple_compressed_armor_leggings"), new NonupleCompressedArmorItem.Leggings());
		NONUPLE_COMPRESSED_ARMOR_BOOTS = Registry.register(Registry.ITEM,
				new ResourceLocation(CompressedGrassMod.MODID, "nonuple_compressed_armor_boots"), new NonupleCompressedArmorItem.Boots());
	}
}
