
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.init.CompressedGrassModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class SextupleCompressedArmorItem extends ArmorItem {
	public SextupleCompressedArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 53;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{7, 21, 18, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 32;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.SEXTUPLE_COMPRESSED_GRASS));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "sextuplecompressed";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SextupleCompressedArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}
	}

	public static class Chestplate extends SextupleCompressedArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}
	}

	public static class Leggings extends SextupleCompressedArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}
	}

	public static class Boots extends SextupleCompressedArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}
	}
}
