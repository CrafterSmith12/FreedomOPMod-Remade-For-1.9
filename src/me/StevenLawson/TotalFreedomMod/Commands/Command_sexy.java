package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "buildcarter8 is totally sexy!", usage = "/<command>")
public class Command_sexy extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        server.dispatchCommand(sender, "gcmd" + sender.getName() + "me &bbuildcarter8 is sexy!");
        playerMsg("You just said buildcarter8 is sexy! :O", ChatColor.GRAY);
        return true;  
    }
}