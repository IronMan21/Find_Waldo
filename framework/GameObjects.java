package com.waldo.framework;

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class GameObjects {

	protected float x, y;
	protected float velX, velY = 0;
	protected ID id;

	public GameObjects(float x, float y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void tick(LinkedList<GameObjects> objects);

	public abstract void render(Graphics g);

	public abstract void setX(float x);

	public abstract void setY(float y);

	public abstract void setvelX(float velX);

	public abstract void setvelY(float velY);

	public abstract float getX();

	public abstract float getY();

	public abstract float getVelX();

	public abstract float getVelY();

	public abstract ID getid();

}
