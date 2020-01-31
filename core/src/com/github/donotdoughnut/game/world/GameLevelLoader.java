package com.github.donotdoughnut.game.world;

import com.github.donotdoughnut.game.lib.world.level.Level;

public class GameLevelLoader {

	public static class LEVELS {
		
		public static Level test = new Level("TestLevel.tmx");
		
	}
	
	public static Level currentLevel;

	public static void update() {
		currentLevel.update();
	}
	
	public static void render() {
		currentLevel.render();
	}

	public static void dispose() {
		currentLevel.dispose();
	}

	public static void selectLevel(Level level) {
		currentLevel.close();
		currentLevel.dispose();
		currentLevel = level;
	}

}
