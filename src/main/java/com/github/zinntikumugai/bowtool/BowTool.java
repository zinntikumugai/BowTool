/**
 *
 */
package com.github.zinntikumugai.bowtool;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 */
public class BowTool extends JavaPlugin {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BowTool_Listerer(), this);
	}

	public void onDisable() {

	}
}
