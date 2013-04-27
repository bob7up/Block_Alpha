package com.bob7up.blockalpha;

import android.graphics.Rect;

public class Coins 
{	
	private int centerX, centerY;
	private Background bg = GameScreen.getBg1();
	private Robot robot = GameScreen.getRobot();

	public Rect coin = new Rect(0, 0, 0, 0);
	
	public static int coins = 0;
	
	public Coins(int centerX, int centerY) {

		setCenterX(centerX);
		setCenterY(centerY);

	}
	
	public static void onPickup()
	{
		//System.out.println("coin collide");
		coins++;
	}
	
	public void loadCoins()
	{
		coins = Settings.coins;
	}
	
	public void saveCoins()
	{
		Settings.coins = coins;
	}
	
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

}
