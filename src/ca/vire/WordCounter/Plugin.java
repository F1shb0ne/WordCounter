package ca.vire.WordCounter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    PlayerListener LocalPlayerListener = new PlayerListener(this);

    @Override
    public void onEnable() {
        getLogger().info("Starting up.");

        LocalPlayerListener = new PlayerListener(this);
        // Register player listener handler
        this.getServer().getPluginManager().registerEvents(LocalPlayerListener, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("wc")) {

            String player = sender.getName();

            getLogger().info(player + " used the /wc command");

            return true;
        }

        return false;
    }
}
