package com.bob7up.blockalpha;

import java.util.List;

import android.graphics.Color;
import android.graphics.Paint;
import com.bob7up.framework.Game;
import com.bob7up.framework.Graphics;
import com.bob7up.framework.Image;
import com.bob7up.framework.Screen;
import com.bob7up.framework.Input.TouchEvent;

public class DiffScreen extends Screen
{
    public DiffScreen(Game game) 
    {
		super(game);
		
		paint = new Paint();
		paint.setTextSize(30);
		paint.setTextAlign(Paint.Align.CENTER);
		paint.setAntiAlias(true);
		paint.setColor(Color.WHITE);
	}

	public static int diff = 0;
    Paint paint, paint2;

	@Override
	public void update(float deltaTime) 
	{		
		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();

		int len = touchEvents.size();
		for (int i = 0; i < len; i++) {
			TouchEvent event = touchEvents.get(i);
			if (event.type == TouchEvent.TOUCH_UP) {

				if (inBounds(event, 50, 350, 250, 450)) {
					//
				}

			}
		}
	}

	private boolean inBounds(TouchEvent event, int x, int y, int width,
			int height) {
		if (event.x > x && event.x < x + width - 1 && event.y > y
				&& event.y < y + height - 1)
			return true;
		else
			return false;
	}


	@Override
	public void paint(float deltaTime) 
	{
		Graphics g = game.getGraphics();
		
		g.drawRect(0, 0, 1281, 801, Color.BLACK);
		
		g.drawString("Easy", 450, 100, paint);
		g.drawString("Medium", 450, 250, paint);
		g.drawString("Hard", 450, 400, paint);
	}

	@Override
	public void pause() 
	{
			
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backButton() {
		// TODO Auto-generated method stub
		
	}
}
