
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterhuntercraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.monsterhuntercraft.MonsterHunterCraftMod;

public class MonsterHunterCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MonsterHunterCraftMod.MODID);
	public static final RegistryObject<Item> PEPITO_PIERNAS_CORTAS_SPAWN_EGG = REGISTRY.register("pepito_piernas_cortas_spawn_egg", () -> new ForgeSpawnEggItem(MonsterHunterCraftModEntities.PEPITO_PIERNAS_CORTAS, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
