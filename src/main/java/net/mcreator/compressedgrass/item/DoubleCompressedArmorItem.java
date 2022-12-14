
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

public abstract class DoubleCompressedArmorItem extends ArmorItem {
	public DoubleCompressedArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 23;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 9, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("entity.armor_stand.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.DOUBLE_COMPRESSED_GRASS));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "doublecompressed";
			}

			@Override
			public float getToughness() {
				return 0.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DoubleCompressedArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Chestplate extends DoubleCompressedArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Leggings extends DoubleCompressedArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}

	public static class Boots extends DoubleCompressedArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}
	}
}
