package com.tankwars.model;

import com.tankwars.util.Constants;

public class Hero extends Tank {

	private int bulletNum = Constants.BULLET_NUM_DEFAULT;

	{
		direct = Constants.UP;
		isMoving = false;
	}
	
	private int hp = Constants.HERO_HP;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

}
