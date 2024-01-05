package com.kesug.codeforfree.mrp_mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrpMod implements ModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(Constants.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MineCraft Supporting Mod has been initialized");
	}
}
