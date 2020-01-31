package com.github.donotdoughnut.game.lib.world.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.donotdoughnut.game.lib.world.level.Level;

public abstract class Entity {

	protected boolean alive = false;
	public Level level;
	
	protected float x, y;
	protected int layer;
	
	public Entity(Level level, float x, float y, int layer) {
		this.level = level;
	}
	
	
	public abstract void update();
	
	public abstract void render(SpriteBatch batch);
	
	
	public void spawn() {
		alive = true;
	}

	public void despawn() {
		alive = false;
	}
	
	public boolean isAlive() {
		return alive;
	}
	

	public void setX(float x) {
		this.x = x;
	}
	
	public void offsetX(float x) {
		this.x+=x;
	}
	
	public float getX() {
		return x;
	}
	
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void offsetY(float y) {
		
	}
	
	public float getY() {
		return y;
	}
	
}
