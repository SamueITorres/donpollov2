package org.miguel.donpollov2.world.gen;
import blocks.BlockDonPollo;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DON_POLLO_ORE_KEY = RegistryKey.of(
            RegistryKeys.CONFIGURED_FEATURE,
            Identifier.of("donpollov2", "don_pollo_ore")
    );

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        context.register(DON_POLLO_ORE_KEY, new ConfiguredFeature<>(
                Feature.ORE,
                new OreFeatureConfig(
                        List.of(OreFeatureConfig.createTarget(
                                new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES),
                                BlockDonPollo.DON_POLLO_BLOCK.getDefaultState()
                        )),
                        7 // Tamaño de la veta
                )
        ));
    }




    }
