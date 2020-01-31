package com.github.donotdoughnut.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.github.donotdoughnut.game.world.GameLevelLoader;

public class Game extends ApplicationAdapter {
	
	GameLevelLoader levelLoader;
	
	@Override
	public void create () {
		
		GameLevelLoader.selectLevel(GameLevelLoader.LEVELS.test);
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		
	}

	@Override
	public void render () {
		
		GameLevelLoader.update();
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		GameLevelLoader.render();
		

	}
	
	@Override
	public void dispose () {
		GameLevelLoader.dispose();
	}
}
