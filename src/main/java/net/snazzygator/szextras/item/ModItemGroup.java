package net.snazzygator.szextras.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup SZEXTRAS_TAB = new ItemGroup("szextrasModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
