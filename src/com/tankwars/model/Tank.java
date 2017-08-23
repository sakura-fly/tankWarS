package com.tankwars.model;

import java.awt.Graphics;

import com.tankwars.util.Constants;

public class Tank extends MoveObj implements DrawObj {
	
	

	public Tank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tank(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDraw(Graphics g) {
		g.setColor(color);
		// TODO Auto-generated method stub
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
					x + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2,
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_GUN_HIGHT);
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
					y + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_GUN_HIGHT);
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
					x + Constants.TANK_CATERPILLAR_HIGHT / 2 + Constants.TANK_GUN_HIGHT,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2);
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
					x + Constants.TANK_CATERPILLAR_HIGHT / 2 - Constants.TANK_GUN_HIGHT,
					y + Constants.TANK_CATERPILLAR_WITH + Constants.TANK_BODY_WITH / 2);
			break;

		default:
			break;
		}
	}

}
