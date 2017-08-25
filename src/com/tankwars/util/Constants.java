package com.tankwars.util;

import java.awt.event.KeyEvent;

public class Constants {

	public static final String TITILE = "坦克大战";

	// 方向
	public static final int UP = 1;
	public static final int DOWN = -1;
	public static final int LIFT = 2;
	public static final int RIGHT = -2;

	// 速度
	public static final int SPEED_DEFAULT = 1;// 默认

	public static final int SPEED_BULLET = 3;// 子弹
	// 长宽高//界面
	public static final int WITH_PANEL = 800;
	public static final int HIGHT_PANEL = 500;

	// 子弹
	public static final int BULLET_NUM_DEFAULT = 5;// 数量

	public static final int TARK_NUM_DEFAULT = 3;// 敌对坦克数量

	// 坦克caterpillar履带
	public static final int TANK_CATERPILLAR_WITH = 15;
	public static final int TANK_CATERPILLAR_HIGHT = 60;
	public static final int TANK_RADIUS = 30;// 圆
	public static final int TANK_BODY_WITH = 30;// 身体
	public static final int TANK_BODY_HIGHT = 40;
	// public static final int TANK_GUN_HIGHT = 20 * 2;

	public static final int TANK_DISTANCE = 90;// 初始坦克之间的距离

	public static final int TIMER_DELAY = 10;
	public static final int TIMER_PERIOD = 3;

	public static final int BULLET_JG = 20;

	public static final int TANK_SHOT = BULLET_JG * 10;

	public static final int GAME_STAT_LIVE = 1;
	public static final int GAME_STAT_PAUSE = 2;
	public static final int GAME_STAT_OVER = 3;
	public static final int GAME_STAT_READY = 0;
	
	
	
	// 方向键
	public static final int UP_KEY = KeyEvent.VK_W;
	public static final int DOWN_KEY = KeyEvent.VK_S;
	public static final int LIFT_KEY = KeyEvent.VK_A;
	public static final int RIGHT_KEY = KeyEvent.VK_D;
	
	public static final int SHOT_KEY = KeyEvent.VK_SPACE;
	
	public static final int HERO_HP = 5;

}
