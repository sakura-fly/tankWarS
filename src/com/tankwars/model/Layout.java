package com.tankwars.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.tankwars.util.Constants;

public class Layout extends JPanel implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ArrayList<Tank> tanks = new ArrayList<>();
	ArrayList<Bullet> bullets = new ArrayList<>();

	Hero h = null;

	private int pressKey;

	public Layout() {
		for (int i = 0; i < Constants.TARK_NUM_DEFAULT; i++) {
			Tank t = new Tank((i + 1) * Constants.TANK_DISTANCE, 0);
			t.setColor(Color.BLUE);
			tanks.add(t);
		}
		h = new Hero(Constants.WITH_PANEL / 2, Constants.HIGHT_PANEL / 2);
		h.setColor(Color.yellow);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, Constants.WITH_PANEL, Constants.HIGHT_PANEL);
		h.doDraw(g);
		for (int i = 0; i < tanks.size(); i++) {
			tanks.get(i).doDraw(g);
		}
	}

	public void action() {

		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread th = new Thread(new Runnable() {

					@Override
					public void run() {
						h.move();
						repaint();
					}
				});
				th.start();
			}
		}, Constants.TIMER_DELAY, Constants.TIMER_PERIOD);
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
			// // 判断玩家是否按下j键
			// if (this.hero.ss.size() <= 4)
			// this.hero.shotMe();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (pressKey == e.getKeyCode())
			h.setMoving(false);

	}

}
