package com.tankwar.dd;

import com.tankwar.model.PaintModel;

import java.awt.*;

public class Draw {
    public void drawTank(Graphics g, PaintModel model){
        model.paint(g);
    }
}
