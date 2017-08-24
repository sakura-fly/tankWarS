package com.tankwars.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.tankwars.dd.Impact;
import com.tankwars.util.Constants;

public class Layout extends JPanel implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int num = 0;

	ArrayList<Tank> tanks = new ArrayList<>();
	ArrayList<Bullet> hBullets = new ArrayList<>();
	ArrayList<Bullet> tBullets = new ArrayList<>();

	Impact i = new Impact();

	Hero h = null;

	private int pressKey;

	public Layout() {
		for (int i = 0; i < Constants.TARK_NUM_DEFAULT; i++) {
			Tank t = new Tank((i + 1) * Constants.TANK_DISTANCE, 0);
			t.setColor(Color.BLUE);
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
		h.doDraw(g);
		// 对面的
		for (int i = 0; i < tanks.size(); i++) {
			tanks.get(i).doDraw(g);
		}
		// 我的子弹
		for (int i = 0; i < hBullets.size(); i++) {
			Bullet hb = hBullets.get(i);
			hb.move();
			hb.doDraw(g);
			if (this.i.out(hb, this)) {
				hBullets.remove(hb);
			}
		}
		// 对面的子弹
	}

	public void action() {

		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				num++;
				Thread th = new Thread(new Runnable() {

					@Override
					public void run() {
						shoot();
						moveHero();
						repaint();
					}

				});
				th.start();
			}
		}, Constants.TIMER_DELAY, Constants.TIMER_PERIOD);
	}

	// 发射弹药

	private void shoot() {
		// 我发子弹
		if (h.isShot) {
			if (num % Constants.BULLET_JG == 1) {
				hBullets.add(h.shot());
			}

		}
		// 对面的发子弹
		for (int i = 0; i < tanks.size(); i++) {
			Tank t = tanks.get(i);
			if ((int) (Math.random() * 10) % 10 == 3) {
				tBullets.add(t.shot());
			}
		}
	}

	private void moveHero() {

		h.move();
		boolean p = false;
		for (int i = 0; i < tanks.size(); i++) {
			if (this.i.peng(h, tanks.get(i))) {
				p = true;
				break;
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
		if (e.getKeyCode() == KeyEvent.VK_J) {
			h.isShot = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (pressKey == e.getKeyCode())
			h.setMoving(false);
		if (e.getKeyCode() == KeyEvent.VK_J) {
			h.isShot = false;
		}
	}

}
