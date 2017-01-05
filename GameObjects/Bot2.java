package com.waldo.GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.waldo.framework.GameObjects;
import com.waldo.framework.ID;
import com.waldo.framework.Texture;
import com.waldo.window.Game;

public class Bot2 extends GameObjects {

	Texture tex = Game.getInstance();
	
	public Bot2(float x, float y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick(LinkedList<GameObjects> objects) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
//		g.fillRect((int) x, (int) y, 40, 60);
		g.drawImage(tex.bots[1], (int)x, (int)y, null);
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		this.y =y;
	}

	@Override
	public void setvelX(float velX) {
		// TODO Auto-generated method stub
		this.velX = velX;
	}

	@Override
	public void setvelY(float velY) {
		// TODO Auto-generated method stub
		this.velY = velY;
	}

	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public float getVelX() {
		// TODO Auto-generated method stub
		return velX;
	}

	@Override
	public float getVelY() {
		// TODO Auto-generated method stub
		return velY;
	}

	@Override
	public ID getid() {
		// TODO Auto-generated method stub
		return id;
	}

}