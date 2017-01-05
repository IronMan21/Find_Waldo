package com.waldo.window;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JFrame;

public class Window {
	
	public Window(int w, int h, String title, Game game){
		game.setPreferredSize(new Dimension(w,h));
		game.setMaximumSize(new Dimension(w,h));
		game.setMinimumSize(new Dimension(w,h));
		
		JFrame frame = new JFrame(title);
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		game.start();
		
	}

}
