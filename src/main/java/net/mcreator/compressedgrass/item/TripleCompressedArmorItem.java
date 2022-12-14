
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class TripleCompressedArmorItem extends ArmorItem {
	public TripleCompressedArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("entity.armor_stand.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.TRIPLE_COMPRESSED_GRASS));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "triplecompressed";
			}

			@Override
			public float getToughness() {
				return 0.3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TripleCompressedArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Chestplate extends TripleCompressedArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Leggings extends TripleCompressedArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Boots extends TripleCompressedArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}
}
