package com.tankwar.model;

import java.awt.*;

public class Tank extends MovingModel implements PaintModel{
    protected int oldDirect;

    @Override
    public void paint(Graphics g) {
//        direct
    }

    @Override
    public int getOldDirect() {
        return oldDirect;
    }

    @Override
    public void setOldDirect(int oldDirect) {
        this.oldDirect = oldDirect;
    }
}
