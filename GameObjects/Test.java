package com.waldo.GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.waldo.framework.GameObjects;
import com.waldo.framework.ID;
import com.waldo.framework.Texture;
import com.waldo.window.Game;

public class Test extends GameObjects {
	// this is waldo
	
	// shorter way of writing
	// Texture tex;
	// public Test(float x, float y, ID id, Texture tex) {
	// super(x, y, id);
	// this.tex = new Tex();
	// }
	Texture tex = Game.getInstance();

	public Test(float x, float y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	public void tick(LinkedList<GameObjects> objects) {

	}

	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		
		// g.fillRect((int)x, (int)y, 40, 60);
		g.drawImage(tex.player[0], (int) x, (int) y, null);
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setvelX(float velX) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setvelY(float velY) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getVelX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getVelY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ID getid() {
		// TODO Auto-generated method stub
		return id;
	}

}
