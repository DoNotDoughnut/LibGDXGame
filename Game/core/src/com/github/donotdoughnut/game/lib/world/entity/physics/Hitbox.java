package com.github.donotdoughnut.game.lib.world.entity.physics;

import com.badlogic.gdx.math.Vector2;
import com.github.donotdoughnut.game.lib.world.entity.Mob;
import com.github.donotdoughnut.game.lib.world.tile.Tile;

public class Hitbox {

	private int width, height;
	private Mob owner;

	public Hitbox(Mob owner, int width, int height) {
		this.owner = owner;
		this.width = width;
		this.height = height;
	}
	
	public boolean collisionAny(float x, float y, int width, int height) {
		if (x < 0 || y < 0 || x + width > Tile.SIZE * owner.level.getWidth() || y + height > owner.level.getHeight())
			return true;
		
		for (int row = (int) (y / Tile.SIZE); row < Math.ceil((y + height) / Tile.SIZE); row++) {
			for (int col = (int) (x / Tile.SIZE); col < Math.ceil((x + width) / Tile.SIZE); col++) {
				for (int layer = 0; layer < owner.level.getLayers(); layer++) {
					Tile type = owner.level.getTileTypeByCoordinate(layer, col, row);
					if (type != null && type.isSolid())
						return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	
}
