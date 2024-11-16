
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterhuntercraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.monsterhuntercraft.entity.PepitoPiernasCortasEntity;
import net.mcreator.monsterhuntercraft.MonsterHunterCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonsterHunterCraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MonsterHunterCraftMod.MODID);
	public static final RegistryObject<EntityType<PepitoPiernasCortasEntity>> PEPITO_PIERNAS_CORTAS = register("pepito_piernas_cortas",
			EntityType.Builder.<PepitoPiernasCortasEntity>of(PepitoPiernasCortasEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PepitoPiernasCortasEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PepitoPiernasCortasEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PEPITO_PIERNAS_CORTAS.get(), PepitoPiernasCortasEntity.createAttributes().build());
	}
}
