package net.teamhollow.direbats.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.teamhollow.direbats.entity.direbat_fang_arrow.DirebatFangArrowEntity;

public class DirebatFangArrowItem extends ArrowItem {
    public static final String id = DirebatFangArrowEntity.id;

    public DirebatFangArrowItem(Item.Properties settings) {
        super(settings);
    }

    public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
        return new DirebatFangArrowEntity(worldIn, shooter);
    }
}