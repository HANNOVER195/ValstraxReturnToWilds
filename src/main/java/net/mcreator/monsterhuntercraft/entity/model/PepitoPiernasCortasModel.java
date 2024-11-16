package net.mcreator.monsterhuntercraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.monsterhuntercraft.entity.PepitoPiernasCortasEntity;

public class PepitoPiernasCortasModel extends GeoModel<PepitoPiernasCortasEntity> {
	@Override
	public ResourceLocation getAnimationResource(PepitoPiernasCortasEntity entity) {
		return new ResourceLocation("monster_hunter_craft", "animations/shrykos.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PepitoPiernasCortasEntity entity) {
		return new ResourceLocation("monster_hunter_craft", "geo/shrykos.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PepitoPiernasCortasEntity entity) {
		return new ResourceLocation("monster_hunter_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
