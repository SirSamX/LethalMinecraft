package me.sirsam.lethalminecraft

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier


class ModItems {
    private fun register(name: String, itemFactory: (Item.Settings) -> Item, settings: Item.Settings): Item {
        val id = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LethalMinecraft.MOD_ID))
        val item = itemFactory(settings)
        return Registry.register(Registries.ITEM, id, item)
    }
    init {
        val flashlight = register("flashlight", ::Item, Item.Settings())
        val proFlashLight = register("pro_flashlight", ::Item, Item.Settings())
    }
}