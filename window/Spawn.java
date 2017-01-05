package com.waldo.window;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.waldo.GameObjects.Background;
import com.waldo.GameObjects.Bot1;
import com.waldo.GameObjects.Bot10;
import com.waldo.GameObjects.Bot11;
import com.waldo.GameObjects.Bot12;
import com.waldo.GameObjects.Bot13;
import com.waldo.GameObjects.Bot14;
import com.waldo.GameObjects.Bot15;
import com.waldo.GameObjects.Bot16;
import com.waldo.GameObjects.Bot17;
import com.waldo.GameObjects.Bot18;
import com.waldo.GameObjects.Bot19;
import com.waldo.GameObjects.Bot2;
import com.waldo.GameObjects.Bot3;
import com.waldo.GameObjects.Bot4;
import com.waldo.GameObjects.Bot5;
import com.waldo.GameObjects.Bot6;
import com.waldo.GameObjects.Bot7;
import com.waldo.GameObjects.Bot8;
import com.waldo.GameObjects.Bot9;
import com.waldo.GameObjects.Test;
import com.waldo.framework.ID;
import com.waldo.window.Game.States;

public class Spawn extends MouseAdapter {

	private HUD hud;
	private Handler handler;
	private Game game;
	private Random rand = new Random();
	int randTesty = rand.nextInt(510);
	int randTestx = rand.nextInt(760);
	int randTesty2 = rand.nextInt(510);
	int randTestx2 = rand.nextInt(760);
	int randTesty3 = rand.nextInt(510);
	int randTestx3 = rand.nextInt(760);
	int randTesty4 = rand.nextInt(510);
	int randTestx4= rand.nextInt(760);
	int randTesty5 = rand.nextInt(510);
	int randTestx5 = rand.nextInt(760);
	int randTesty6 = rand.nextInt(510);
	int randTestx6 = rand.nextInt(760);
	int randTesty7 = rand.nextInt(510);
	int randTestx7 = rand.nextInt(760);
	int randTesty8 = rand.nextInt(510);
	int randTestx8 = rand.nextInt(760);
	int randTesty9 = rand.nextInt(510);
	int randTestx9 = rand.nextInt(760);

	int counter = 1;

	public Spawn(HUD hud, Handler handler, Game game) {
		this.handler = handler;
		this.game = game;
		this.hud = hud;
	}

	public void tick() {

	}

	// create your generated waldo image below (named Test)
	// use MouseAdapter also

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		
		if (game.gameState == States.Game) {
			if (counter == 1) { // level 1
				if (MouseOver(mx, my, randTestx, randTesty, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setTimer(hud.getTimer() + 30);
					hud.setNumW(hud.getNumW() + 1);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx, randTesty, 40, 60)) {
					handler.clearAll();
					hud.setTimer(hud.getTimer() - 1);
					handler.addObject(new Background(0, 0, ID.Background));
					// adding the player and bots to the game
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					handler.addObject(new Test(randTestx, randTesty, ID.Test));
				}
			} else if (counter == 2) { // level 2
				if (MouseOver(mx, my, randTestx2, randTesty2, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx2, randTesty2, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 1);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					handler.addObject(new Test(randTestx2, randTesty2, ID.Test));
				}
			} 
			else if (counter == 3) { // level 3
				if (MouseOver(mx, my, randTestx3, randTesty3, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx3, randTesty3, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					handler.addObject(new Test(randTestx3, randTesty3, ID.Test));
				}
			} 
			else if (counter == 4) { // level 4
				if (MouseOver(mx, my, randTestx4, randTesty4, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx4, randTesty4, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 1);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					handler.addObject(new Test(randTestx4, randTesty4, ID.Test));
				}
			} else if (counter == 5) { // level 5
				if (MouseOver(mx, my, randTestx5, randTesty5, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx5, randTesty5, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 1);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					handler.addObject(new Test(randTestx5, randTesty5, ID.Test));
				}
			} else if (counter == 6) { // level 6
				if (MouseOver(mx, my, randTestx6, randTesty6, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx6, randTesty6, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					handler.addObject(new Test(randTestx6, randTesty6, ID.Test));
				}
			} else if (counter == 7) { // level 7
				if (MouseOver(mx, my, randTestx7, randTesty7, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx7, randTesty7, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					handler.addObject(new Test(randTestx7, randTesty7, ID.Test));
				}
			} else if (counter == 8) { // level 8
				if (MouseOver(mx, my, randTestx8, randTesty8, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx8, randTesty8, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					handler.addObject(new Test(randTestx8, randTesty8, ID.Test));
				}
			} else if (counter == 9) { // level 9
				if (MouseOver(mx, my, randTestx9, randTesty9, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx9, randTesty9, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					handler.addObject(new Test(randTestx9, randTesty9, ID.Test));
				}
			} else if (counter == 10) { // level 10
				if (MouseOver(mx, my, randTestx, randTesty3, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx, randTesty3, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					handler.addObject(new Test(randTestx, randTesty3, ID.Test));
				}
			} else if (counter == 11) { // level 11
				if (MouseOver(mx, my, randTestx5, randTesty8, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx5, randTesty8, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					handler.addObject(new Test(randTestx5, randTesty8, ID.Test));
				}
			} else if (counter == 12) { // level 12
				if (MouseOver(mx, my, randTestx2, randTesty4, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx2, randTesty4, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					handler.addObject(new Test(randTestx2, randTesty4, ID.Test));
				}
			} else if (counter == 13) { // level 13
				if (MouseOver(mx, my, randTestx3, randTesty, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx3, randTesty, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					handler.addObject(new Background(0, 0, ID.Background));
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					handler.addObject(new Test(randTestx3, randTesty, ID.Test));
				}
			} else if (counter == 14) { // level 14
				if (MouseOver(mx, my, randTestx9, randTesty3, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx9, randTesty3, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					handler.addObject(new Test(randTestx9, randTesty3, ID.Test));
				}
			} else if (counter == 15) { // level 15
				if (MouseOver(mx, my, randTestx6, randTesty7, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx6, randTesty7, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot15(rand.nextInt(780), rand.nextInt(510), ID.Bot15));
					}
					handler.addObject(new Test(randTestx6, randTesty7, ID.Test));
				}
			} else if (counter == 16) { // level 16
				if (MouseOver(mx, my, randTestx4, randTesty2, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx4, randTesty2, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot15(rand.nextInt(780), rand.nextInt(510), ID.Bot15));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot16(rand.nextInt(780), rand.nextInt(510), ID.Bot16));
					}
					handler.addObject(new Test(randTestx4, randTesty2, ID.Test));
				}
			} else if (counter == 17) { // level 17
				if (MouseOver(mx, my, randTestx2, randTesty5, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx2, randTesty5, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot15(rand.nextInt(780), rand.nextInt(510), ID.Bot15));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot16(rand.nextInt(780), rand.nextInt(510), ID.Bot16));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot17(rand.nextInt(780), rand.nextInt(510), ID.Bot17));
					}
					handler.addObject(new Test(randTestx2, randTesty5, ID.Test));
				}
			} else if (counter == 18) { // level 18
				if (MouseOver(mx, my, randTestx8, randTesty9, 40, 60)) {
					handler.addObject(new Background(0, 0, ID.Background));
					handler.clearAll();
					hud.setNumW(hud.getNumW() + 1);
					hud.setTimer(hud.getTimer() + 30);
					counter++;
				}
				if (!MouseOver(mx, my, randTestx8, randTesty9, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 30; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot15(rand.nextInt(780), rand.nextInt(510), ID.Bot15));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot16(rand.nextInt(780), rand.nextInt(510), ID.Bot16));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot17(rand.nextInt(780), rand.nextInt(510), ID.Bot17));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot18(rand.nextInt(780), rand.nextInt(510), ID.Bot18));
					}
					handler.addObject(new Test(randTestx8, randTesty9, ID.Test));
				}
			} else if (counter == 19) { // level 19
				if (MouseOver(mx, my, randTestx7, randTesty3, 40, 60)) {
					game.gameState = States.Winner;
					handler.clearAll();
					hud.setNumW(0);
					hud.setTimer(70);
					counter = 1;
				}
				if (!MouseOver(mx, my, randTestx7, randTesty3, 40, 60)) {
					handler.clearAll();
					handler.addObject(new Background(0, 0, ID.Background));
					hud.setTimer(hud.getTimer() - 10);
					// adding the player and bots to the game
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot1(rand.nextInt(780), rand.nextInt(510), ID.Bot1));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot2(rand.nextInt(780), rand.nextInt(510), ID.Bot2));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot3(rand.nextInt(780), rand.nextInt(510), ID.Bot3));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot4(rand.nextInt(780), rand.nextInt(510), ID.Bot4));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot5(rand.nextInt(780), rand.nextInt(510), ID.Bot5));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot6(rand.nextInt(780), rand.nextInt(510), ID.Bot6));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot7(rand.nextInt(780), rand.nextInt(510), ID.Bot7));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot8(rand.nextInt(780), rand.nextInt(510), ID.Bot8));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot9(rand.nextInt(780), rand.nextInt(510), ID.Bot9));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot10(rand.nextInt(780), rand.nextInt(510), ID.Bot10));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot11(rand.nextInt(780), rand.nextInt(510), ID.Bot11));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot12(rand.nextInt(780), rand.nextInt(510), ID.Bot12));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot13(rand.nextInt(780), rand.nextInt(510), ID.Bot13));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot14(rand.nextInt(780), rand.nextInt(510), ID.Bot14));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot15(rand.nextInt(780), rand.nextInt(510), ID.Bot15));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot16(rand.nextInt(780), rand.nextInt(510), ID.Bot16));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot17(rand.nextInt(780), rand.nextInt(510), ID.Bot17));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot18(rand.nextInt(780), rand.nextInt(510), ID.Bot18));
					}
					for (int i = 0; i < 10; i++) {
						handler.addObject(new Bot19(rand.nextInt(780), rand.nextInt(510), ID.Bot19));
					}
					handler.addObject(new Test(randTestx7, randTesty3, ID.Test));
				}
			}
		}
	}

	public void mouseReleased(MouseEvent e) {

	}

	public boolean MouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx >= x && mx <= x + width) {
			if (my >= y && my <= y + height) {
				return true;
			}
			return false;
		}
		return false;
	}

}