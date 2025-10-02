package me.sirsam.lethalminecraft

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object LethalMinecraft : ModInitializer {
    const val MOD_ID = "lethalminecraft"
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        LOGGER.info("Hello Fabric world!")
    }
}