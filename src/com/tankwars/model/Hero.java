package com.tankwars.model;

import com.tankwars.util.Constants;

public class Hero extends Tank {

	private int bulletNum = Constants.BULLET_NUM_DEFAULT;
	private boolean isMoving = false;

	{
		direct = Constants.UP;
	}

	public Hero() {
		super();

	}

	public Hero(int x, int y) {
		super(x, y);
	}

	public int getBulletNum() {
		return bulletNum;
	}

	public void setBulletNum(int bulletNum) {
		this.bulletNum = bulletNum;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	@Override
	public void move() {
		if (isMoving)
			super.move();
	}
}
