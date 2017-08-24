package com.tankwars.model;

import java.awt.Color;

import com.tankwars.util.Constants;

public abstract class MoveObj {

	protected int x;
	protected int y;
	protected int direct = Constants.DOWN;
	protected int oldDirect = direct;
	protected int speed = Constants.SPEED_DEFAULT;
	protected Color color;
//	protected int ox;
//	protected int oy;
	protected boolean isMoving = true;

	public MoveObj() {
		super();
	}

	public MoveObj(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.oldDirect = this.direct;
		this.direct = direct;
	}

	public int getOldDirect() {
		return oldDirect;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

//	public int getOx() {
//		return ox;
//	}
//
//	public void setOx(int ox) {
//		this.ox = ox;
//	}
//
//	public int getOy() {
//		return oy;
//	}
//
//	public void setOy(int oy) {
//		this.oy = oy;
//	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public void move() {
		if (isMoving) {
			switch (direct) {
			case Constants.UP:
				y -= speed;
				break;
			case Constants.DOWN:
				y += speed;
				break;
			case Constants.LIFT:
				x -= speed;
				break;
			case Constants.RIGHT:
				x += speed;
				break;

			default:

				break;
			}
		}

	}
	
	public void rMove() {
		switch (direct) {
		case Constants.UP:
			y -= -speed;
			break;
		case Constants.DOWN:
			y += -speed;
			break;
		case Constants.LIFT:
			x -= -speed;
			break;
		case Constants.RIGHT:
			x += -speed;
			break;

		default:
			
			break;
		}
	}

}
