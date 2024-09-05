package net.banana.backrooms.block;

import net.banana.backrooms.Backrooms;
import net.banana.backrooms.block.custom.BrokenFluorescentLight;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Mod Blocks here
    public static final Block YELLOW_WALLPAPER_BLOCK = registerBlock("yellow_wallpaper_block",
            new Block(AbstractBlock.Settings.create().strength(-1.0F, 3600000.0F)
                    .sounds(BlockSoundGroup.WOOL).mapColor(MapColor.YELLOW).requiresTool().noBlockBreakParticles()
            ));
    public static final Block MOIST_CARPET_BLOCK = registerBlock("moist_carpet_block",
            new Block(AbstractBlock.Settings.create().strength(-10f, 3600000.0f)
                    .sounds(BlockSoundGroup.MUD).mapColor(MapColor.PALE_YELLOW).requiresTool().noBlockBreakParticles()
                    .velocityMultiplier(0.8F)
            ));
    public static final Block CEILING_TILE_BLOCK = registerBlock("ceiling_tile_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).sounds(BlockSoundGroup.STONE).requiresTool()
                    .noBlockBreakParticles().strength(-10f, 3600000.0f)
            ));
    public static final Block FLUORESCENT_LAMP_BLOCK = registerBlock("fluorescent_lamp_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).sounds(BlockSoundGroup.FROGLIGHT).requiresTool()
                    .noBlockBreakParticles().luminance(state -> 10)
            ));
    public static final Block BROKEN_FLUORESCENT_LAMP_BLOCK = registerBlock("broken_fluorescent_lamp_block",
            new BrokenFluorescentLight(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).sounds(BlockSoundGroup.FROGLIGHT).requiresTool()
                    .noBlockBreakParticles().luminance(state -> state.get(BrokenFluorescentLight.LIT) ? 10 : 0).ticksRandomly()
            ));

    // Helpers
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Backrooms.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Backrooms.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Backrooms.LOGGER.info("Registering Mod Blocks for " + Backrooms.MOD_ID);
    }
}