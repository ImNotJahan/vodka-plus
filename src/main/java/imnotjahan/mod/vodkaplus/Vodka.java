package imnotjahan.mod.vodkaplus;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Vodka
{
    public static final Food VODKA = (new Food.Builder()).hunger(1).saturation(0.1F)
            .effect(new EffectInstance(Effects.STRENGTH, 1200, 3), 1F)
            .effect(new EffectInstance(Effects.NAUSEA, 1200, 3), 0.9F)
            .effect(new EffectInstance(Effects.BLINDNESS, 1200, 1), 0.4F)
            .meat().setAlwaysEdible().build();
}
