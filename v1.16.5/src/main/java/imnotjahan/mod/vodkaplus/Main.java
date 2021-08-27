package imnotjahan.mod.vodkaplus;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Main
{
    public static final ItemGroup VodkaGroup =
            new MenuGroup(Reference.MODID, () -> new ItemStack(Items.POTATO));

    private static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public Main()
    {
        LOGGER.info("Vodka loaded");
    }
}
