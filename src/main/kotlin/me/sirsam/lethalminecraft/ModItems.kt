package me.sirsam.lethalminecraft

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys


class ModItems {
    private fun register(name: String, itemFactory: Item, settings: Item.Settings) {
        val itemKey = RegistryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier )
        Registry.register(Registries.ITEM, item)
    }


}