package net.lordmicaello.mod1.item;

import net.lordmicaello.mod1.Mod1;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mod1.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab CTHULHU_TAB;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event ) {
        CTHULHU_TAB = event.registerCreativeModeTab(new ResourceLocation(Mod1.MODID, "cthulhu_tab"),
                builder -> builder.icon(()-> new ItemStack(ModItems.CTHULHU.get())).title(Component.literal("Cthulhu Tab")).build());
    }
}
