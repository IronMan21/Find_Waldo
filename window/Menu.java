package com.waldo.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;

import com.waldo.framework.Texture;
import com.waldo.window.Game.States;

public class Menu extends MouseAdapter {

	private Game game;
	private Handler handler;
	private Random rand = new Random();
	private Timer myTimer;
	private HUD hud = new HUD();
	private Texture tex = new Texture();

	public Menu(Game game, Handler handler) {
		this.game = game;
		this.handler = handler;
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if (game.gameState == States.Menu) {
			// play button
			if (mouseOver(mx, my, 270, 190, 300, 50)) {
				game.gameState = States.Game;
			}

			// quit button
			if (mouseOver(mx, my, 275, 390, 300, 50)) {
				System.exit(0);
			}

			// help button
			if (mouseOver(mx, my, 275, 290, 300, 50)) {
				game.gameState = States.Help;
			}
		} else if (game.gameState == States.Help) {
			// back button for help
			if (mouseOver(mx, my, 310, 350, 200, 50)) {
				game.gameState = States.Menu;
			}
		} else if (game.gameState == States.End) {
			// try again button for loser screen
			if (mouseOver(mx, my, 305, 350, 200, 50)) {
				game.gameState = States.Game;
			}
		} else if (game.gameState == States.Winner){
			// PLAY AGAIN button
			if(mouseOver(mx, my, 305, 350, 210, 50))
				game.gameState = States.Game;
		}
	}

	public void mouseReleased(MouseEvent e) {

	}

	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx > x && mx < x + width) {
			if (my > y && my < y + height) {
				return true;
			} else
				return false;
		} else
			return false;

	}

	public void tick() {

	}

	public void render(Graphics g) {
		if (game.gameState == States.Menu) {
			// title
			g.setColor(Color.RED);
			Font myFont1 = new Font("TimesRoman", 3, 100);
			g.setFont(myFont1);
			g.drawString("Find Waldo", 175, 100);

			// Play button
			g.setColor(Color.WHITE);
			Font font2 = new Font("TimesRoman", 1, 30);
			g.setFont(font2);
			g.drawRect(275, 190, 300, 50);
			g.drawString("PLAY", 380, 230);

			// Help button
			g.setColor(Color.WHITE);
			g.drawRect(275, 290, 300, 50);
			g.drawString("HELP", 380, 330);

			// Quit button
			g.setColor(Color.WHITE);
			g.setFont(font2);
			g.drawRect(275, 390, 300, 50);
			g.drawString("QUIT", 380, 430);
		} else if (game.gameState == States.Help) {
			// Help Menu
			g.setColor(Color.WHITE);
			Font myFont1 = new Font("TimesRoman", 3, 20);
			g.setFont(myFont1);
			
			g.drawString("Here is Waldo : ", 92, 230);
			g.drawImage(tex.player[0], 250, 182, null); // drawing waldo
			
			g.drawString("Find waldo. Click on him and more time will be given "
					+ "to you for the next game.", 90, 300);
			g.drawString( "The maximum level is 19.", 90, 330);		
			g.setFont(myFont1);

			g.setColor(Color.WHITE);
			Font font2 = new Font("TimesRoman", 1, 30);
			g.setFont(font2);
			g.drawRect(310, 350, 200, 50);
			g.drawString("BACK", 370, 386);


		} else if (game.gameState == States.End) {
			// Loser Screen
			g.setColor(Color.RED);
			Font myFont1 = new Font("TimesRoman", 3, 60);
			g.setFont(myFont1);
			g.drawString("Time's Up", 300, 100);
			g.setFont(myFont1);

			// try again button
			g.setColor(Color.WHITE);
			Font font2 = new Font("TimesRoman", 1, 30);
			g.setFont(font2);
			g.drawRect(305, 350, 200, 50);
			g.drawString("TRY AGAIN", 318, 386);
		} else if (game.gameState == States.Winner) {
			// Winner Screen
			g.setColor(Color.WHITE);
			Font myFont1 = new Font("TimesRoman", 3, 60);
			g.setFont(myFont1);
			g.drawString("YOU WIN", 300, 100);
			g.setFont(myFont1);

			// play again button
			g.setColor(Color.WHITE);
			Font font2 = new Font("TimesRoman", 1, 30);
			g.setFont(font2);
			g.drawRect(305, 350, 210, 50);
			g.drawString("PLAY AGAIN", 318, 386);
		}

	}
}
