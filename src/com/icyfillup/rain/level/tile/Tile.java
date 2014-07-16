package com.icyfillup.rain.level.tile;

import com.icyfillup.rain.graphics.Screen;
import com.icyfillup.rain.graphics.Sprite;

public class Tile
{
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	
	public Tile(Sprite sprite)
	{
		this.sprite = sprite;
		
	}
	
	public void render(int x, int y, Screen screen)
	{
		screen.renderTile(x, y, this);
	}
	
	public boolean solid()
	{
		return false;
	}
}
