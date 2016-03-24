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

	private BowTool_Config configs;

	public void onEnable() {

		getServer().getPluginManager().registerEvents(new BowTool_Listerer(), this);
		getCommand("bow").setExecutor(new BowTool_Command());
	}

	public void onDisable() {

	}

	public BowTool_Config configs() {
		return configs;

	}
}
