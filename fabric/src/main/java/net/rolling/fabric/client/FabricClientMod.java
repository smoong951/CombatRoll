package net.rolling.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.rolling.client.RollingKeybings;

public class FabricClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for(var keybinding: RollingKeybings.all) {
            KeyBindingHelper.registerKeyBinding(keybinding);
        }
    }
}