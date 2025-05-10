package blocks;

import blocks.groupArticule.ArticleGroup;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;


import static blocks.ModBlocks.register;


public class BlockDonPollo {

    public static final Block DON_POLLO_BLOCK=register(
            "don_pollo_block",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(1.5f,6.0f),
            true
    );


    public static final RegistryKey<PlacedFeature> DON_POLLO_ORE_PLACED_KEY = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE,
            Identifier.of("donpollov2", "don_pollo_ore_placed") // verify
    );




    public static void registerBlock(){
        ModBlocks.initialize();
    }


}
