package com.github.donotdoughnut.game.lib.world.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.donotdoughnut.game.lib.world.entity.physics.Hitbox;
import com.github.donotdoughnut.game.lib.world.level.Level;

public abstract class Mob extends Entity {

	protected Hitbox hitbox;
	protected Texture texture;

	public Mob(Level level, Texture texture, Hitbox hitbox, float x, float y, int layer) {
		super(level, x, y, layer);
		this.texture = texture;
		this.hitbox = new Hitbox(this, texture.getWidth(), texture.getHeight());
	}

	@Override
	public void update() {

	}

	@Override
	public void render(SpriteBatch batch) {

	}

}
