package imnotjahan.mod.vodkaplus;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Main
{
    public static final CreativeModeTab VodkaGroup =
            new CreativeModeTab(Reference.MODID)
            {
                @Override
                public ItemStack makeIcon()
                {
                    return new ItemStack(Items.POTATO);
                }
            };

    private static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public Main()
    {
        LOGGER.info("Vodka loaded");
    }
}
