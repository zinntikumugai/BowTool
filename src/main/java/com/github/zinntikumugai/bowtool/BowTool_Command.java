/**
 *
 */
package com.github.zinntikumugai.bowtool;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class BowTool_Command implements CommandExecutor {
	private BowTool bowtool;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player player = null;

		//このプラグイン以外のコマンドは終了
		if(!command.getName().equalsIgnoreCase("bow"))
			return false;

		//コンソールからのコマンドははじく
		if( sender instanceof Player) {
			player = (Player)sender;
		}else {
			sender.sendMessage(ChatColor.RED +  "Can Not command consol!!");
		}

		/* 以下の条件を持っているもののみリロードコマンドを実行可能
		 * ・入力したパラメータ数が1
		 * ・そのパラメータがreload
		 * ・権限"bowtool.reload"を持っている 
		 * 
		 * /bow reload
		 */
		if(args.length == 1 && args[0].equalsIgnoreCase("reload") && player.hasPermission("bowtool.reload")) {
			bowtool.reloadConfig();
			if(player != null)
				player.sendMessage("[BowTool] Configuration reloaded.");
		}
		else if(args[0].equalsIgnoreCase("tp") && player.hasPermission("bowtool.tp")) {
			
			
		}
		
		return false;
	}

}
