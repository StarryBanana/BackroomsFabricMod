package net.banana.backrooms.item;

import net.banana.backrooms.Backrooms;
import net.banana.backrooms.item.custom.PokerItem;
import net.banana.backrooms.item.custom.WrenchItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WRENCH = registerItem("wrench", new WrenchItem(new Item.Settings().maxDamage(40).maxCount(1)));
    public static final Item POKER = registerItem("poker", new PokerItem(new Item.Settings().maxDamage(40).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Backrooms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Backrooms.LOGGER.info("Registering Mod Items for " + Backrooms.MOD_ID);
    }
}