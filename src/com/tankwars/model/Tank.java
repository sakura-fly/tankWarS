package com.tankwars.model;

import java.awt.Color;
import java.awt.Graphics;

import com.tankwars.util.Constants;

public class Tank extends MoveObj implements DrawObj {

	int gunX;
	int gunY;
	boolean isShot;
	protected boolean isMoving = true;

	public boolean isShot() {
		return isShot;
	}

	public void setShot(boolean isShot) {
		this.isShot = isShot;
	}

	public int getGunY() {
		return gunY;
	}

	public void setGunY(int gunY) {
		this.gunY = gunY;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public Tank() {
		super();
	}

	public Tank(int x, int y) {
		super(x, y);
	}

	public Bullet shot() {
		Bullet b = new Bullet(gunX, gunY);
		b.setDirect(direct);
		b.setColor(Color.red);
		// b.setColor(Color.getColor("#66ccff"));
		return b;
	}

	@Override
	public void doDraw(Graphics g) {
		g.setColor(color);
		switch (direct) {
		case Constants.UP:
			g.fill3DRect(x, y, Constants.TANK_CATERPILLAR_WITH, Constants.TANK_CATERPILLAR_HIGHT, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_WITH,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_BODY_HIGHT / 2, Constants.TANK_BODY_WITH,
					Constants.TANK_BODY_HIGHT, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH, y,
					Constants.TANK_CATERPILLAR_WITH, Constants.TANK_CATERPILLAR_HIGHT, false);
			g.drawOval(x + Constants.TANK_CATERPILLAR_WITH,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_RADIUS / 2, Constants.TANK_RADIUS,
					Constants.TANK_RADIUS);
			g.drawLine(x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2,
					x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2, y);
			gunX = x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2;
			gunY = y;
			break;
		case Constants.DOWN:
			g.fill3DRect(x, y, Constants.TANK_CATERPILLAR_WITH, Constants.TANK_CATERPILLAR_HIGHT, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_WITH,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_BODY_HIGHT / 2, Constants.TANK_BODY_WITH,
					Constants.TANK_BODY_HIGHT, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH, y,
					Constants.TANK_CATERPILLAR_WITH, Constants.TANK_CATERPILLAR_HIGHT, false);
			g.drawOval(x + Constants.TANK_CATERPILLAR_WITH,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_RADIUS / 2, Constants.TANK_RADIUS,
					Constants.TANK_RADIUS);
			g.drawLine(x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2,
					x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_CATERPILLAR_HIGHT / 2);
			gunX = x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2;
			gunY = y + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_CATERPILLAR_HIGHT / 2;
			break;
		case Constants.RIGHT:
			g.fill3DRect(x, y, Constants.TANK_CATERPILLAR_HIGHT, Constants.TANK_CATERPILLAR_WITH, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_BODY_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH, Constants.TANK_BODY_HIGHT, Constants.TANK_BODY_WITH, false);
			g.fill3DRect(x, y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH,
					Constants.TANK_CATERPILLAR_HIGHT, Constants.TANK_CATERPILLAR_WITH, false);
			g.drawOval(x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_RADIUS / 2,
					y + Constants.TANK_CATERPILLAR_WITH, Constants.TANK_RADIUS, Constants.TANK_RADIUS);
			g.drawLine(x + Constants.TANK_CATERPILLAR_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					x + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_CATERPILLAR_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2);
			gunX = x + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_CATERPILLAR_HIGHT / 2;
			gunY = y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2;
			break;
		case Constants.LIFT:
			g.fill3DRect(x, y, Constants.TANK_CATERPILLAR_HIGHT, Constants.TANK_CATERPILLAR_WITH, false);
			g.fill3DRect(x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_BODY_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH, Constants.TANK_BODY_HIGHT, Constants.TANK_BODY_WITH, false);
			g.fill3DRect(x, y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH,
					Constants.TANK_CATERPILLAR_HIGHT, Constants.TANK_CATERPILLAR_WITH, false);
			g.drawOval(x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_RADIUS / 2,
					y + Constants.TANK_CATERPILLAR_WITH, Constants.TANK_RADIUS, Constants.TANK_RADIUS);
			g.drawLine(x + Constants.TANK_CATERPILLAR_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_CATERPILLAR_HIGHT / 2,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2);
			gunX = x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_CATERPILLAR_HIGHT / 2;
			gunY = y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2;
			break;

		default:
			direct = oldDirect;
			isMoving = false;
			doDraw(g);
			break;
		}
	}

}
