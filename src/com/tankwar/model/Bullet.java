package com.tankwar.model;

import com.tankwar.util.Constant;

import java.awt.*;

public class Bullet extends MovingModel implements PaintModel {

    {
        this.speed = Constant.SPEED_BULLET;
    }

    public Bullet(int x, int y, Color color) {
        super(x, y, color);
    }

    public Bullet(int direct, int x, int y) {
        this.direct = direct;
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(g.getColor());
        g.draw3DRect(x,y,1,1,false);
    }
}
