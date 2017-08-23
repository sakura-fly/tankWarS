package com.tankwars.dd;

import com.tankwars.model.Bullet;
import com.tankwars.model.Tank;
import com.tankwars.util.Constants;

public class Impact {

	public boolean out(Tank m) {
		return m.getX() < 0 || m.getY() < 0 || m.getX() > Constants.WITH_PANEL - Constants.TANK_CATERPILLAR_WITH
				|| m.getY() > Constants.HIGHT_PANEL - Constants.TANK_CATERPILLAR_HIGHT;
	}

	public boolean out(Bullet m) {
		return m.getX() < 0 || m.getY() < 0 || m.getX() > Constants.WITH_PANEL || m.getY() > Constants.HIGHT_PANEL;
	}

}
