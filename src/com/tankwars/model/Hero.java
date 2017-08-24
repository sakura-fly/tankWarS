package com.tankwars.model;

import com.tankwars.util.Constants;

public class Hero extends Tank {

	private int bulletNum = Constants.BULLET_NUM_DEFAULT;
	

	{
		direct = Constants.UP;
		isMoving = false;
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



	@Override
	public void move() {
		if (isMoving)
			super.move();
	}
}
