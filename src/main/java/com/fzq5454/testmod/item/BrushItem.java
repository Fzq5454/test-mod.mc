package com.fzq5454.testmod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class BrushItem extends Item {
    public BrushItem(Settings settings) {
        super(settings);
    }

    // 在方块上右键时触发
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()) { // 仅在服务端发消息一次
            PlayerEntity player = context.getPlayer();
            if (player != null) {
                player.sendMessage(Text.of("Hello world!"), false);
            }
        }
        // 返回 success，根据客户端/服务端自动处理
        return ActionResult.success(world.isClient());
    }
}