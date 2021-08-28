package imnotjahan.mod.vodkaplus;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class EventSubscriber
{
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().tab(Main.VodkaGroup).food(Foods.POTATO_BUCKET)), "potato_bucket"),
                setup(new Item(new Item.Properties().tab(Main.VodkaGroup).food(Foods.BOILED_POTATO)), "boiled_potato"),
                setup(new Item(new Item.Properties().tab(Main.VodkaGroup).food(Foods.MASHED_POTATO)), "mashed_potato"),
                setup(new Item(new Item.Properties().tab(Main.VodkaGroup).food(Foods.UNDISTILLED_VODKA)), "undistilled_vodka"),
                setup(new Item(new Item.Properties().tab(Main.VodkaGroup).food(Foods.VODKA)), "vodka")
            );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name)
    {
        return setup(entry, new ResourceLocation(Reference.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
    {
        entry.setRegistryName(registryName);
        return entry;
    }
}