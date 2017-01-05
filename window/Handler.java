package com.waldo.window;

import java.awt.Graphics;
import java.util.LinkedList;

import com.waldo.GameObjects.Test;
import com.waldo.framework.GameObjects;
import com.waldo.framework.ID;
import com.waldo.window.Game.States;

public class Handler {

	public LinkedList<GameObjects> objects = new LinkedList<GameObjects>();
	private GameObjects tempObject;
	private ID id;
	private Game game;

	public void tick() {
		for (int i = 0; i < objects.size(); i++) {
			tempObject = objects.get(i);
			tempObject.tick(objects);
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			tempObject = objects.get(i);
			tempObject.render(g);
		}
	}

	public void addObject(GameObjects objects) {
		this.objects.add(objects);
	}

	public void removeObject(GameObjects objects) {
		this.objects.remove(objects);
	}

	public void clearAll() {
			objects.clear();
	}
	
	
	

}
