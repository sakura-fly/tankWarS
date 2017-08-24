package com.tankwars.dd;

import com.tankwars.model.Tank;
import com.tankwars.util.Constants;

public class AI {

	public int moveNum = -1;
	public int shotNum;

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

}
