package com.tankwars.dd;

import com.tankwars.model.Tank;
import com.tankwars.util.Constants;

public class AI {

	private int moveNum = -1;
	private int shotNum = -1;

	public void move(Tank t) {
		moveNum--;
		if (moveNum < 0) {
			t.setMoving(true);
			moveNum = (int) (Math.random() * Constants.HIGHT_PANEL);
			t.setDirect((int) (Math.random() * 5) - 1);
		}
		if (moveNum > 0 && t.isMoving()) {
			t.move();
		}
	}

	public void shot(Tank t) {
		shotNum--;
		if(shotNum < 0){
			moveNum = (int) (Math.random() * Constants.TANK_SHOT);
			t.setShot((int) (Math.random() * 2) == 1);
		}
//		if(shotNum > 0 && t.isShot()){
//			t.setShot(true);
//		} else {
//			t.setShot(false);
//		}
		
	}

}
