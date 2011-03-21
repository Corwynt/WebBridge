package de.minecognix.webbridge.commands;

import de.minecognix.webbridge.WebBridge;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    private final WebBridge plugin;

    public TestCommand(WebBridge plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            return false;
        }
    }

