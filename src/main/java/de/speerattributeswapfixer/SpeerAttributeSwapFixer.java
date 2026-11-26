package de.speerattributeswapfixer;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpeerAttributeSwapFixer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Absichtlich keine zusaetzlichen Plugin-Logmeldungen.
        // Paper selbst kann weiterhin normale Servermeldungen ausgeben.
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("dwg")) {
            return false;
        }

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Dieser Befehl kann nur im Spiel verwendet werden.");
            return true;
        }

        if (args.length != 0) {
            player.sendMessage("Benutzung: /dwg");
            return true;
        }

        if (player.getGameMode() == GameMode.CREATIVE) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§aSpielmodus: Survival");
        } else {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§aSpielmodus: Creative");
        }

        return true;
    }
}
