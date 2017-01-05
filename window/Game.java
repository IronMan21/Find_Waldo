package com.waldo.window;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import com.waldo.framework.Texture;

public class Game extends Canvas implements Runnable {
	// main game file

	private static final long serialVersionUID = -7324915518255599464L;
	private Thread thread;
	private boolean running = false;

	// objects
	private Handler handler;
	private Random rand;
	private HUD hud;
	private Menu menu;
	private Spawn spawner;
	static Texture tex;

	public enum States {
		Menu, Game, End, Winner, Help;
	}

	public States gameState = States.Menu;

	public void init() {

		tex = new Texture();

		handler = new Handler();
		menu = new Menu(this, handler);
		hud = new HUD();
		spawner = new Spawn(hud, handler, this);
		rand = new Random();
		this.addMouseListener(menu);
		this.addMouseListener(spawner);

		// if(gameState == States.Game){
		// // adding the player and bots to the game
		// for(int i = 0; i < 400; i++){
		// handler.addObject(new Bots3(rand.nextInt(800), rand.nextInt(550),
		// ID.Bot3));
		// }
		// for(int i = 0; i < 500; i++){
		// handler.addObject(new Bot1(rand.nextInt(800), rand.nextInt(550),
		// ID.Bot1));
		// }
		// for(int i = 0; i < 300; i++){
		// handler.addObject(new Bot2(rand.nextInt(800), rand.nextInt(550),
		// ID.Bot2));
		// }
		// handler.addObject(new Test(rand.nextInt(800), rand.nextInt(550),
		// ID.Test));
		// }

	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		// game loop
		this.requestFocus();
		init();

		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS: " + frames + " TICKS: " + updates);
				// System.out.println("FPS: " + frames + " Ticks" + updates);
				frames = 0;
				updates = 0;
			}
		}
	}

	public void tick() {
		if (gameState == States.Game) {
			handler.tick();
			hud.tick();
			spawner.tick();
		} else if (gameState == States.Menu)
			menu.tick();

		if (hud.getTimer() <= 0) {
			gameState = States.End;
			handler.clearAll();
			hud.setTimer(60);
			hud.setNumW(0);
		}
	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();

		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		// draw here
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		if (gameState == States.Game) {
			handler.render(g);
			hud.render(g);
		} else if (gameState == States.Menu) {
			menu.render(g);
		} else if (gameState == States.Help) {
			menu.render(g);
		} else if (gameState == States.End) {
			menu.render(g);
		} else if (gameState == States.Winner)
			menu.render(g);
		/////

		g.dispose();
		bs.show();
	}

	public static Texture getInstance() {
		return tex;
	}

	public static void main(String args[]) {
		new Window(800, 600, "Where's Waldo", new Game());

	}

}
