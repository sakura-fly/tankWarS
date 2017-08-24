package com.tankwars.dd;

import com.tankwars.model.Bullet;
import com.tankwars.model.Layout;
import com.tankwars.model.Tank;
import com.tankwars.util.Constants;

public class Impact {

	public boolean out(Tank m, Layout layout) {
		return m.getX() < 0 || m.getY() < 0 || m.getX() > layout.getWidth() - Constants.TANK_CATERPILLAR_HIGHT
				|| m.getY() > layout.getHeight() - Constants.TANK_CATERPILLAR_HIGHT;
	}

	public boolean out(Bullet m, Layout layout) {
		return m.getX() < 0 || m.getY() < 0 || m.getX() > layout.getWidth() || m.getY() > layout.getHeight();
	}

	public boolean peng(Tank i, Tank a) {
		return i.getX() > a.getX() - Constants.TANK_CATERPILLAR_HIGHT
				&& i.getX() < a.getX() + Constants.TANK_CATERPILLAR_HIGHT
				&& i.getY() > a.getY() - Constants.TANK_CATERPILLAR_HIGHT
				&& i.getY() < a.getY() + Constants.TANK_CATERPILLAR_HIGHT
				|| a.getX() > i.getX() - Constants.TANK_CATERPILLAR_HIGHT
						&& a.getX() < i.getX() + Constants.TANK_CATERPILLAR_HIGHT
						&& a.getY() > i.getY() - Constants.TANK_CATERPILLAR_HIGHT
						&& a.getY() < i.getY() + Constants.TANK_CATERPILLAR_HIGHT;
	};

	public boolean duang(Bullet b, Tank t) {
		return b.getX() > t.getX() && b.getY() > t.getY() && b.getX() < t.getX() + Constants.TANK_CATERPILLAR_HIGHT
				&& b.getY() < t.getY() + Constants.TANK_CATERPILLAR_HIGHT;
	}

}
