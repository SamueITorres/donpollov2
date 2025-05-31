package org.miguel.donpollov2.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.miguel.donpollov2.Donpollov2;
import org.miguel.donpollov2.entity.custom.DonPolloEntity;

public class ModEntities {
    public static final Identifier id = Identifier.of(Donpollov2.MOD_ID, "don_pollo");

    public static final RegistryKey<EntityType<?>> key = RegistryKey.of(Registries.ENTITY_TYPE.getKey(), id);

    public static final EntityType<DonPolloEntity> DON_POLLO = Registry.register(
            Registries.ENTITY_TYPE,
            id,
            EntityType.Builder.create(DonPolloEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f)
                    .build(key)
    );

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(DON_POLLO,DonPolloEntity.createAttributes());
    }


    public static void registerModEntities(){
        Donpollov2.LOGGER.info("Registering mod Entities for "+Donpollov2.MOD_ID);
        registerAttributes();// REGISTRA LOS ATRIBUTOS AQUÍ

    }
}
