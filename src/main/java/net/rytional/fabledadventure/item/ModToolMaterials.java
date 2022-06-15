package net.rytional.fabledadventure.item;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    ULTIUM(3, 3200, 12.0F, 5.0F, 32, () -> Ingredient.ofItems(ModItems.ULTIUM_INGOT)),

    SORCIUM(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.SORCIUM_INGOT)),

    ORCANITE(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.ORCANITE_INGOT)),

    DWARFIUM(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.DWARFIUM_INGOT)),

    DRAGONITE(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.DRAGONITE_INGOT)),

    ELFIUM(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.ELFIUM_INGOT)),

    FAENITE(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.FAENITE_INGOT)),

    GINORMIUM(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.GINORMIUM_INGOT)),

    NATURITE(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.NATURITE_INGOT)),

    HUMANITE(3, 1600, 8.0F, 3.5F, 24, () -> Ingredient.ofItems(ModItems.HUMANITE_INGOT))
    ;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
