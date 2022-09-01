package de.compsience.bosszombie.Commands;

import de.compsience.bosszombie.Utils.Items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class giveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            return true;
        }
        Player p = (Player) commandSender;
        p.getInventory().addItem(Items.bossItem());
        p.getInventory().addItem(Items.summonItem());

        return false;
    }
}
