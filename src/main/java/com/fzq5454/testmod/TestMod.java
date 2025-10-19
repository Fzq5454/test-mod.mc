package com.fzq5454.testmod;

import net.fabricmc.api.ModInitializer;

public class TestMod implements ModInitializer {
    public static final String MODID = "test";

    @Override
    public void onInitialize() {
        // 注册物品
        com.fzq5454.testmod.item.ModItems.register();
    }
}