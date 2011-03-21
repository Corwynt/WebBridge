
package de.minecognix.webbridge;

import de.minecognix.webbridge.commands.*;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Miscellaneous administrative commands
 *
 * @author Dinnerbone
 */
public class WebBridge extends JavaPlugin {

    public void onDisable() {
    }

    public void onEnable() {       
        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );

        getCommand("test").setExecutor(new TestCommand(this));
    }

    public boolean anonymousCheck(CommandSender sender) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Cannot execute that command, I don't know who you are!");
            return true;
        } else {
            return false;
        }
    }

    public Player matchPlayer(String[] split, CommandSender sender) {
        Player player;
        List<Player> players = getServer().matchPlayer(split[0]);
        if (players.isEmpty()) {
            sender.sendMessage(ChatColor.RED + "Unknown player");
            player = null;
        } else {
            player = players.get(0);
        }
        return player;
    }
}