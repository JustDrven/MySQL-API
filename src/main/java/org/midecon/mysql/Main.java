package org.midecon.mysql;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
           getLogger().info("Plugin was been Enabled!");
        } catch (Exception exception) {
            getLogger().info("Error with: "+ exception.toString());
        }
    }
}
