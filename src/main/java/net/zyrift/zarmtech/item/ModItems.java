package net.zyrift.zarmtech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zyrift.zarmtech.ZaRmTech;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZaRmTech.MOD_ID);

    public static final RegistryObject<Item> SILVER = ITEMS.register("silver",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
