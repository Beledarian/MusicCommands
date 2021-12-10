package beledarian.custommusic.main;

import beledarian.custommusic.commands.MusicCommands;
import beledarian.custommusic.commands.OnTabCompleteMusic;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("&aThanks for downloading Beledarians music plugin. ");
        getCommand("music").setExecutor(new MusicCommands());
        getCommand("music").setTabCompleter(new OnTabCompleteMusic());

        // Plugin startup logic

    }
    public static Main getPlugin() {
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
