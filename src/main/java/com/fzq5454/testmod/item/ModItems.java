package com.fzq5454.testmod.item;

import com.fzq5454.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item BRUSH;

    public static void register() {
        BRUSH = Registry.register(
            Registry.ITEM,
            new Identifier(TestMod.MODID, "brush"),
            new BrushItem(new Item.Settings().maxCount(1)) // 不可堆叠：maxCount(1)
        );
    }
}