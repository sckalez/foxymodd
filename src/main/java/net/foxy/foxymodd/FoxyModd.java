package net.foxy.foxymodd;

import net.fabricmc.api.ModInitializer;

import net.foxy.foxymodd.block.ModBlocks;
import net.foxy.foxymodd.item.ModItemGroups;
import net.foxy.foxymodd.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoxyModd implements ModInitializer {
    public static final String MOD_ID = "foxymodd";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}