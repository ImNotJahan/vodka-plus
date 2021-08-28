package imnotjahan.mod.vodkaplus;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods
{
    public static final Food VODKA = (new Food.Builder()).nutrition(1)
            .effect(new EffectInstance(Effects.DAMAGE_BOOST, 1200, 2), 1F)
            .effect(new EffectInstance(Effects.CONFUSION, 1200, 2), 0.9F)
            .effect(new EffectInstance(Effects.BLINDNESS, 1200, 1), 0.4F)
            .meat().alwaysEat().build();
    public static final Food UNDISTILLED_VODKA = (new Food.Builder()).nutrition(2)
            .effect(new EffectInstance(Effects.CONFUSION, 1200, 1), 0.9F)
            .alwaysEat().build();

    public static final Food POTATO_BUCKET = (new Food.Builder()).nutrition(4).build();
    public static final Food BOILED_POTATO = (new Food.Builder()).nutrition(5).build();
    public static final Food MASHED_POTATO = (new Food.Builder()).nutrition(5).build();
}
