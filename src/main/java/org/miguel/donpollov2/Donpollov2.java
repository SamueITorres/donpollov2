    package org.miguel.donpollov2;
    import blocks.BlockDonPollo;
    import blocks.groupArticule.ArticleGroup;
    import net.fabricmc.api.ModInitializer;
    import net.fabricmc.fabric.api.biome.v1.BiomeModification;
    import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
    import net.minecraft.registry.RegistryBuilder;
    import net.minecraft.registry.RegistryKeys;
    import org.miguel.donpollov2.worldgen.WorldGeneration;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

            public class Donpollov2 implements ModInitializer {

                public static final String MOD_ID="donpollov2";
                public static final Logger LOGGER=LoggerFactory.getLogger("donpollo");

                @Override
                public void onInitialize() {
                    LOGGER.info("Registrando el bloque !!!!");
                    ArticleGroup.initialize();
                    BlockDonPollo.registerBlock();


                    WorldGeneration.registerWorldGen();


                }
            }
