package com.waldo.framework;

import java.awt.image.BufferedImage;

public class Texture {

	SpriteSheet bs, ps;
	private BufferedImage char_sheet = null;
	private BufferedImage background_sheet = null;
	
	public BufferedImage[] player = new BufferedImage[1];
	public BufferedImage[] bots = new BufferedImage[20];
	public BufferedImage[] bg = new BufferedImage[1];
	
	public Texture(){
		BufferedImageLoader loader = new BufferedImageLoader();
		
		try{
			char_sheet = loader.loadImage("/spriteSheet.png");
			background_sheet = loader.loadImage("/Background.png");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		bs = new SpriteSheet(background_sheet);
		ps = new SpriteSheet(char_sheet);
		
		getTextures();
	}
	
	private void getTextures(){
		player[0] = ps.grabImage(1, 1, 40, 60); // waldo image
		bg[0] = bs.grabImage(1, 1, 820 , 560); // background
		
		int col = 1;
		int row = 1;
		for(int i = 0; i < bots.length; i++){ // bot images
			if(col == 1 && row == 1) 
				col++;
			bots[i] = ps.grabImage(col, row, 40, 60);
			col++;
			if(col == 5){
				row++;
				col = 1;
			}
			if(col == 4 && row == 5)
				break;
		}
		
	}
	
}
