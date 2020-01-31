package com.github.donotdoughnut.game.lib.world.level;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.github.donotdoughnut.game.lib.world.entity.Entity;
import com.github.donotdoughnut.game.lib.world.tile.Tile;

public abstract class Level {

	protected ArrayList<Entity> entities;
	
	public TiledMap tiledMap;
	
	protected OrthogonalTiledMapRenderer tiledMapRenderer;
	protected OrthographicCamera camera;

	public Level(String path) {
		tiledMap = new TmxMapLoader().load("levels/"+path);
	}
	
	public void render(SpriteBatch batch) {
		for (Entity entity : entities) {
			entity.render(batch);
		}
	}
	
	public void update() {
		for (Entity entity : entities) {
			entity.update();
		}
	}
	
	public abstract void close();
	
	public void dispose () {
		tiledMap.dispose();
	}
	
	public Tile getTileTypeByCoordinate(int layer, int col, int row) {
		
	}
	
	public abstract int getWidth();
	public abstract int getHeight();
	public abstract int getLayers();
	
	public int getPixelWidth() {
		return this.getWidth() * Tile.SIZE;
	}
	
	public int getPixelHeight() {
		return this.getHeight() * Tile.SIZE;
	}

	
	
}
