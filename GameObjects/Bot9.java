package com.waldo.GameObjects;



import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.waldo.framework.GameObjects;
import com.waldo.framework.ID;
import com.waldo.framework.Texture;
import com.waldo.window.Game;

public class Bot9 extends GameObjects {

	Texture tex = Game.getInstance();
	
	public Bot9(float x, float y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}
	
	public void tick(LinkedList<GameObjects> objects) {
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.red);;
//		g.fillRect((int)x, (int)y, 40, 60);
		g.drawImage(tex.bots[8], (int)x, (int)y, null);
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
		return null;
	}

	
}

