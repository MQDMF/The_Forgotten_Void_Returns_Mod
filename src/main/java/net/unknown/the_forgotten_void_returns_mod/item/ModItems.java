package net.unknown.the_forgotten_void_returns_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unknown.the_forgotten_void_returns_mod.The_Forgotten_Void_Returns_Mod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, The_Forgotten_Void_Returns_Mod.MOD_ID);


    public static final RegistryObject<Item> VoidStone =  ITEMS.register("voidstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_VoidStone =  ITEMS.register("raw_voidstone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
