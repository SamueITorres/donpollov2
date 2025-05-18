package org.miguel.donpollov2.items;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.miguel.donpollov2.Donpollov2;

import java.util.function.Function;

public class ModItems {



    public static final Item DON_POLLO_MINERAL =
            register("don_pollo_mineral", Item::new, new Item.Settings());

    public static final Item DON_POLLO_EGG=register("egg_don_pollo",Item::new, new Item.Settings());


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
