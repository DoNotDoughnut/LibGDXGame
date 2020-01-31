package com.github.donotdoughnut.game.lib.world.tile;

import com.badlogic.gdx.graphics.Texture;

public abstract class Tile {

	public static final int SIZE = 16;
	
	protected Texture texture;
	protected boolean solid;
	
	public Tile(Texture texture, boolean solid) {
		this.texture = texture;
		this.solid = solid;
	}
	
	public boolean isSolid() {
		return solid;
	}
	
}
