    package org.miguel.donpollov2.worldgen;
    import net.minecraft.world.gen.YOffset;
    import net.minecraft.registry.Registerable;
    import net.minecraft.registry.RegistryKey;
    import net.minecraft.registry.RegistryKeys;
    import net.minecraft.util.Identifier;
    import net.minecraft.world.gen.feature.PlacedFeature;
    import net.minecraft.world.gen.placementmodifier.*;
    import java.util.List;

    public class ModPlacedFeatures {

            public static final RegistryKey<PlacedFeature> DON_POLLO_ORE_PLACED_KEY = RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of("donpollov2", "don_pollo_ore_placed") // verify
            );

        public static void bootstrap(Registerable<PlacedFeature> context) {
            var configuredFeatureLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
            var configuredFeature = configuredFeatureLookup.getOrThrow(ModConfiguredFeatures.DON_POLLO_ORE_KEY);

            context.register(DON_POLLO_ORE_PLACED_KEY, new PlacedFeature(
                    configuredFeature,
                    List.of(
                            CountPlacementModifier.of(10), // Número de vetas por chunk
                            SquarePlacementModifier.of(),
                            HeightRangePlacementModifier.uniform(
                                    YOffset.fixed(0),
                                    YOffset.fixed(64)
                            ),
                            BiomePlacementModifier.of()
                    )
            ));
        }
    }
