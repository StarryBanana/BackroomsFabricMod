package net.banana.backrooms.item;

import net.banana.backrooms.Backrooms;
import net.banana.backrooms.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BACKROOMS_BUILDING_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Backrooms.MOD_ID, "backrooms_building_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.YELLOW_WALLPAPER_BLOCK))
                    .displayName(Text.translatable("blockgroup.backrooms.backrooms_building_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.YELLOW_WALLPAPER_BLOCK);
                        entries.add(ModBlocks.MOIST_CARPET_BLOCK);
                        entries.add(ModBlocks.CEILING_TILE_BLOCK);
                        entries.add(ModBlocks.FLUORESCENT_LAMP_BLOCK);
                        entries.add(ModBlocks.BROKEN_FLUORESCENT_LAMP_BLOCK);

                    }).build());


    public static final ItemGroup BACKROOMS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Backrooms.MOD_ID, "backrooms_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.YELLOW_WALLPAPER_BLOCK))
                    .displayName(Text.translatable("itemgroup.backrooms.backrooms_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WRENCH);
                        entries.add(ModItems.POKER);
                    }).build());

    public static void registerItemGroups() {
        Backrooms.LOGGER.info("Registering Item Groups for " + Backrooms.MOD_ID);
    }
}
