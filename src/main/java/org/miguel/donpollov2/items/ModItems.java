package org.miguel.donpollov2.items;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.component.ComponentChanges;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import org.miguel.donpollov2.Donpollov2;
import org.miguel.donpollov2.sword.SwordItem;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public class ModItems {



    public static final Item DON_POLLO_MINERAL =
            register("don_pollo_mineral", Item::new, new Item.Settings());

    public static final ToolMaterial SWORD_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            ToolMaterial.DIAMOND.repairItems()
    );



    public static final Item SWORD_DON_POLLO = register(
            "sword_don_pollo",
            settings -> new SwordItem(SWORD_TOOL_MATERIAL, 10, 1f, settings),
            new Item.Settings()
    );




    private  static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Donpollov2.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize(){

    }


}
