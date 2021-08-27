package imnotjahan.mod.vodkaplus;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Vodka
{
    public static final Food VODKA = (new Food.Builder()).nutrition(1)
            .effect(new EffectInstance(Effects.DAMAGE_BOOST, 1200, 3), 1F)
            .effect(new EffectInstance(Effects.CONFUSION, 1200, 3), 0.9F)
            .effect(new EffectInstance(Effects.BLINDNESS, 1200, 1), 0.4F)
            .meat().alwaysEat().build();
}
