package com.tankwars.model;

import java.awt.Graphics;

import com.tankwars.util.Constants;

public class Bullet extends MoveObj implements DrawObj{
	
	{
		speed = Constants.SPEED_BULLET;
	}

	public Bullet() {
		super();
	}

	public Bullet(int x, int y) {
		super(x, y);
	}

	@Override
	public void doDraw(Graphics g) {
		g.draw3DRect(x, y, 1, 1, false);
	}
	
	

}
