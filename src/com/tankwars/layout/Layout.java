package com.tankwars.layout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.tankwars.dd.AI;
import com.tankwars.dd.Impact;
import com.tankwars.model.Bullet;
import com.tankwars.model.Hero;
import com.tankwars.model.Tank;
import com.tankwars.util.Constants;

public class Layout extends JPanel implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int num = 0;
	// private int stat =

	ArrayList<Tank> tanks = new ArrayList<>();
	ArrayList<Bullet> hBullets = new ArrayList<>();
	ArrayList<Bullet> tBullets = new ArrayList<>();

	Impact i = new Impact();
	AI ai = new AI();

	Hero h = null;

	private int pressKey;

	public Layout() {
		for (int i = 0; i < Constants.TARK_NUM_DEFAULT; i++) {
			Tank t = new Tank((i + 1) * Constants.TANK_DISTANCE, 0);
			t.setColor(Color.BLUE);
			// t.setShot(true);
			tanks.add(t);
		}
		Tank t = new Tank(150, 150);
		t.setColor(Color.BLUE);
		tanks.add(t);

		h = new Hero(Constants.WITH_PANEL / 2, Constants.HIGHT_PANEL / 2);
		// h = new Hero(12, 12);
		h.setColor(Color.yellow);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, Constants.WITH_PANEL, Constants.HIGHT_PANEL);
		// 话我
		paintHero(g);
		// 对面的
		paintTanks(g);

		// 我的子弹
		paintHBullet(g);
		// 对面的子弹
		paintTBullet(g);
	}

	private void paintHero(Graphics g) {
		h.doDraw(g);
		moveHero();
		for (int i = 0; i < tBullets.size(); i++) {
			Bullet b = tBullets.get(i);
			if (this.i.duang(b, h)) {
				System.out.println("我要死了!!!!!!!!");
				tBullets.remove(b);
			}
		}

	}

	private void paintTBullet(Graphics g) {
		for (int i = 0; i < tBullets.size(); i++) {
			Bullet hb = tBullets.get(i);
			hb.move();
			hb.doDraw(g);
			if (this.i.out(hb, this)) {
				tBullets.remove(hb);
			}
		}
	}

	private void paintTanks(Graphics g) {
		for (int i = 0; i < tanks.size(); i++) {
			Tank t = tanks.get(i);
			t.doDraw(g);
			moveTank(t);
			for (int j = 0; j < hBullets.size(); j++) {
				Bullet b = hBullets.get(j);
				if (this.i.duang(b, t)) {
					hBullets.remove(b);
					tanks.remove(t);
				}

			}
		}
	}

	private void paintHBullet(Graphics g) {
		for (int i = 0; i < hBullets.size(); i++) {
			Bullet hb = hBullets.get(i);
			hb.move();
			hb.doDraw(g);
			if (this.i.out(hb, this)) {
				hBullets.remove(hb);
			}
		}
	}

	public void action() {

		Timer t = new Timer();
		try {
			t.schedule(new TimerTask() {

				@Override
				public void run() {
					num++;
					Thread th = new Thread(new Runnable() {

						@Override
						public void run() {
							shoot();
							repaint();
						}

					});
					th.start();
				}
			}, Constants.TIMER_DELAY, Constants.TIMER_PERIOD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 发射弹药

	private void shoot() {
		// 我发子弹
		if (num % Constants.BULLET_JG == 1 && h.isShot()) {
			hBullets.add(h.shot());
		}

		// 对面的发子弹
		for (int i = 0; i < tanks.size(); i++) {
			Tank t = tanks.get(i);
			if (num % Constants.BULLET_JG == 1 && t.isShot()) {
				tBullets.add(t.shot());
			}
		}
	}

	private void moveTank(Tank t) {
		ai.move(t);
		ai.shot(t);
		boolean p = false;
		// for (int i = 0; i < tanks.size(); i++) {
		// if (this.i.peng(t, tanks.get(i))) {
		// p = true;
		// break;
		// }
		// }
		if (i.out(t, this) || p) {
			t.setDirect(-t.getDirect());
		} else {
		}
	}

	private void moveHero() {

		h.move();
		boolean p = false;
		for (int i = 0; i < tanks.size(); i++) {
			Tank t = tanks.get(i);
			if (this.i.peng(h, t)) {
				p = true;
				t.setX(t.getOx());
				t.setY(t.getOy());
			}
		}
		if (i.out(h, this) || p) {
			h.setX(h.getOx());
			h.setY(h.getOy());
		} else {
			h.setOx(h.getX());
			h.setOy(h.getY());
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			h.setMoving(true);
			h.setDirect(Constants.UP);
			pressKey = e.getKeyCode();
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			h.setMoving(true);
			h.setDirect(Constants.RIGHT);
			pressKey = e.getKeyCode();
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			h.setMoving(true);
			h.setDirect(Constants.DOWN);
			pressKey = e.getKeyCode();
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			h.setMoving(true);
			h.setDirect(Constants.LIFT);
			pressKey = e.getKeyCode();
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			h.setShot(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (pressKey == e.getKeyCode())
			h.setMoving(false);
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			h.setShot(false);
		}
	}

}
