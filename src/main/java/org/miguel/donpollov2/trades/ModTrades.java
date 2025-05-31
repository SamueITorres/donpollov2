package org.miguel.donpollov2.trades;

import blocks.BlockDonPollo;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.miguel.donpollov2.items.ModItems;

public class ModTrades {


    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
                    factories.add
                            ((entity, random) -> new TradeOffer(
                                    new TradedItem(ModItems.DON_POLLO_MINERAL, 20), // El jugador entrega 1 mineral
                                    new ItemStack(ModItems.SWORD_DON_POLLO, 1),                   // El aldeano entrega 1 huevo
                                    10,   // máximo usos de la oferta
                                    2,    // experiencia que gana el aldeano por la transacción
                                    0.05f // multiplicador de precio
                                    )
                            );
                }
        );
    }
}
