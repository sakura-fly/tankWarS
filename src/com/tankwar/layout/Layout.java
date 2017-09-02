package com.tankwar.layout;

import com.tankwar.model.Hero;
import com.tankwar.model.Tank;
import com.tankwar.util.Constant;
import com.tankwar.util.KeyConstant;
import com.tankwar.util.LayoutConstant;
import com.tankwar.util.MoveConstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Layout extends JPanel implements KeyListener {

    //    Draw draw = new Draw();
    Tank tank = new Tank(100, 100, Color.blue);
    Hero h = new Hero(LayoutConstant.HIGHT / 2, LayoutConstant.HIGHT / 2, Color.red);
    private static int pressKey;

    public Layout() {
        h.setMoving(false);
        h.setDirect(MoveConstant.DIRECT_UP);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        System.out.println("我画画了");
        tank.paint(g);
        h.paint(g);
    }


    public void action() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                repaint();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        doVome();
                    }
                });
                thread.start();
            }
        }, Constant.time1, Constant.time2);

    }

    private void doVome() {
        h.move();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyConstant.UP:
                h.setMoving(true);
                pressKey = e.getKeyCode();
                h.setDirect(MoveConstant.DIRECT_UP);
                break;
            case KeyConstant.DOWN:
                h.setMoving(true);
                pressKey = e.getKeyCode();
                h.setDirect(MoveConstant.DIRECT_DOWN);

                break;
            case KeyConstant.LIFT:
                h.setMoving(true);
                pressKey = e.getKeyCode();
                h.setDirect(MoveConstant.DIRECT_LIFT);

                break;
            case KeyConstant.RIGHT:
                h.setMoving(true);
                pressKey = e.getKeyCode();
                h.setDirect(MoveConstant.DIRECT_RIGHT);

                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == pressKey){
            h.setMoving(false);
        }
    }
}
