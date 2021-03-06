package imnotjahan.mod.vodkaplus;

import net.minecraft.item.Foods;
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
                setup(new Item(new Item.Properties().group(Main.VodkaGroup)), "potato_bucket"),
                setup(new Item(new Item.Properties().group(Main.VodkaGroup)), "boiled_potato"),
                setup(new Item(new Item.Properties().group(Main.VodkaGroup)), "mashed_potato"),
                setup(new Item(new Item.Properties().group(Main.VodkaGroup)), "undistilled_vodka"),
                setup(new Item(new Item.Properties().group(Main.VodkaGroup).food(Vodka.VODKA)), "vodka")
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