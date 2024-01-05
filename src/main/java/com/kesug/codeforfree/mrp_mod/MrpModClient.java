package com.kesug.codeforfree.mrp_mod;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrpModClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Constants.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Dear Player.");
    }
}