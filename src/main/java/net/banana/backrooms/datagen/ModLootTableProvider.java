package net.banana.backrooms.datagen;

import net.banana.backrooms.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CEILING_TILE_BLOCK);
        addDrop(ModBlocks.MOIST_CARPET_BLOCK);
        addDrop(ModBlocks.YELLOW_WALLPAPER_BLOCK);
        addDrop(ModBlocks.FLUORESCENT_LAMP_BLOCK);
        addDrop(ModBlocks.BROKEN_FLUORESCENT_LAMP_BLOCK);
    }
}
