package blocks.groupArticule;

import blocks.BlockDonPollo;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.miguel.donpollov2.Donpollov2;

public class ArticleGroup {

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY=RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Donpollov2.MOD_ID,"item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP= FabricItemGroup.builder()
            .icon(()->new ItemStack(BlockDonPollo.DON_POLLO_BLOCK))
            .displayName(Text.translatable("itemGroup.inventory"))// cambiar
            .build();

    public static void registerGroup(){
        Registry.register(Registries.ITEM_GROUP,CUSTOM_ITEM_GROUP_KEY,CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(BlockDonPollo.DON_POLLO_BLOCK);
        });

    }

    public static void initialize(){
       // registerGroup();
    }
}
