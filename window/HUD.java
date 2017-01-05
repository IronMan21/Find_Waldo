package com.waldo.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class HUD implements Runnable {

	private int numWally = 0;
	private static int timer = 70;
	private boolean running = false;
	
	private Thread thread ;
	
	
	
	// creating your timer and giving it a task
	Timer myTimer = new Timer();
	TimerTask task = new TimerTask(){
		@Override
		public void run(){
			timer --;
			
			if(timer <= 0){
				myTimer.cancel();
			}
		}
	};
	
	public HUD() {
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void start(){
		// checking if the thread is 
		//working or not working
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
		//////////////////////
		
		myTimer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	public void tick() {
		start();
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		Font myFont = new Font("TimesRoman", 2, 19 );
		g.setFont(myFont);
		
		g.drawString("Timer: " + timer, 10, 610);
		g.drawString("Number of Wally found: " + numWally, 10, 580);
	
	}
	
	public void setNumW(int numWally){
		this.numWally = numWally;
	}
	
	public int getNumW(){
		return numWally;
	}
	
	public void setTimer(int timer){
		this.timer = timer;
	}
	
	public int getTimer(){
		return timer;
	}
}
