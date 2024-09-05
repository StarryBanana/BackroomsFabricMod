package net.banana.backrooms;

import net.banana.backrooms.block.ModBlocks;
import net.banana.backrooms.item.ModItemGroups;
import net.banana.backrooms.item.ModItems;
import net.banana.backrooms.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backrooms implements ModInitializer {
	public static final String MOD_ID = "backrooms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();
	}
}