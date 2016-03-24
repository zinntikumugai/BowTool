/**
 *
 */
package com.github.zinntikumugai.bowtool;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class BowTool_Config {
	private BowTool bowtool;
	public FileConfiguration config = null;

	//TPを利用するか
	private boolean usetp;

	//Banを使用するか
	private boolean useban;

	//kickを使用するか
	private boolean usekick;

	//Killを使用するか
	private boolean usekill;

	//Hideを使用するか
	private boolean usehide;

	//showを使用するか
	private boolean useshow;

	//Hideになっているプレイヤーがリログを行ったときに状態を保持するか
	private boolean userehide;

	//コマンド実行からActionが使える時間
	private int limittime;


	public BowTool_Config( final BowTool bowtool) {
		this.bowtool = bowtool;
		loadconfig();
	}

	public boolean loadconfig() {

		//コンフィグファイルが無いならデフォルトを適用
		if(!( new File(bowtool.getDataFolder() + File.separator + "config.yml").exists() )) {
			bowtool.saveDefaultConfig();
		}

		//Reload
		if(config != null)
			bowtool.reloadConfig();

		config		= bowtool.getConfig();

		usetp		= config.getBoolean("use.tp");
		useban		= config.getBoolean("use.ban");
		usekick		= config.getBoolean("use.kick");
		usekill		= config.getBoolean("use.kill");
		usehide		= config.getBoolean("use.hide");
		useshow		= config.getBoolean("use.show");
		userehide	= config.getBoolean("use.rehide");
		limittime	= config.getInt("LimitTime");

		return false;
	}

	/**
	 * Action Tpを使うか<br>
	 * デフォルト: true
	 * @return	usetp
	 */
	public boolean usetp() {
		return usetp;
	}

	/**
	 * Action banを使うか<br>
	 * デフォルト: false
	 * @return	useban;
	 */
	public boolean useban() {
		return useban;
	}

	/**
	 * Action kickを使うかどうか<br>
	 * デフォルト: true
	 * @return	usekick
	 */
	public boolean usekick() {
		return usekick;
	}

	/**
	 * Action killを使うかどうか<br>
	 * デフォルト: true
	 * @return	usekill
	 */
	public boolean usekill() {
		return usekill;
	}

	/**
	 * Action hideを使うかどうか<br>
	 * デフォルト: ture
	 * @return	usehide
	 */
	public boolean usehide() {
		return usehide;
	}

	/**
	 * Action showを使うかどうか<br>
	 * デフォルト: ture
	 * @return	useshow
	 */
	public boolean useshow() {
		return useshow;
	}

	/**
	 * Action rehideを使うかどうか<br>
	 * デフォルト: false
	 * @return
	 */
	public boolean userehide() {
		return userehide;
	}

	/**
	 * コマンド実行後、どれだけのあいだActionが実行できるか(秒)
	 * デフォルト: 15
	 * @return limittime
	 */
	public int limittime() {
		return limittime;
	}
}
