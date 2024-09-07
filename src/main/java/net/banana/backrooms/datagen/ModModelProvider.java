package net.banana.backrooms.datagen;

import net.banana.backrooms.block.ModBlocks;
import net.banana.backrooms.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool yellowWallpaperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_WALLPAPER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOIST_CARPET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CEILING_TILE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLUORESCENT_LAMP_BLOCK);

        yellowWallpaperPool.slab(ModBlocks.YELLOW_WALLPAPER_SLAB);
        yellowWallpaperPool.wall(ModBlocks.YELLOW_WALLPAPER_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WRENCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.POKER, Models.GENERATED);
    }
}
