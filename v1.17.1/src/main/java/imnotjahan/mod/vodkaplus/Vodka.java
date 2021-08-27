package imnotjahan.mod.vodkaplus;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Vodka
{
    public static final FoodProperties VODKA = (new FoodProperties.Builder()).nutrition(1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 3), 1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 1200, 3), 0.9F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 1200, 1), 0.4F)
            .meat().alwaysEat().build();
}
