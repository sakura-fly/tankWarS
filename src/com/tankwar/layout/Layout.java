package com.tankwar.layout;

import com.tankwar.model.Tank;

import javax.swing.*;
import java.awt.*;

public class Layout extends JPanel  {

//    Draw draw = new Draw();
    Tank tank = new Tank(100,100 , Color.blue);
    public Layout(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        tank.paint(g);
    }
}
