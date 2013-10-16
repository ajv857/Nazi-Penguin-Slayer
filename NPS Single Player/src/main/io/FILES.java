package main.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import main.components.frames.Dialogs;

public class FILES {
	public static final String dirtBlock = "../graphic/Dirt Block.png";
	public static final String stoneBlock = "../graphic/Stone Block.png";
	public static final String grassBlock = "../graphic/Grass Block.png";

	public static final String backgroundImage = "../graphic/Game Background.png";
	public static final String ingameMenuBackground = "../graphic/Ingame Menu Background.png";

	public static final String playerImage = "../graphic/Player.png";

	public static final String glockImage = "../graphic/Glock.png";
	public static final String sniperImage = "../graphic/Sniper.png";

	public static final String properties = "properties.properties";

	// public static final String dirtBlock = "C:\\dirt.png";
	// public static final String stoneBlock = "C:\\stone.png";
	// public static final String grassBlock = "C:\\grass.png";
	// public static final String backgroundImage = "C:\\back.png";
	// public static final String playerImage = "C:\\player.png";
	// public static final String ingameMenuBackground = "C:\\imb.png";
	// public static final String properties =
	// "A:\\Google Drive\\AVTECH\\NPS\\Files\\bin\\properties.properties";
	// public static final String properties =
	// "C:\\Users\\Austin\\Google Drive\\AVTECH\\NPS\\Files\\bin\\properties.properties";

	public static final String version = "0.0.1";

	public static boolean saveProperties(Properties prop) {
		try {
			prop.save(new FileOutputStream(new File(properties)),
					"Properties File for Nazi Penguin Slayer");
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Dialogs.errorDiagExit("Cannot find the properties file at "
					+ FILES.properties + ".\nPlease reinstall the game.");
			return false;
		}
	}
}