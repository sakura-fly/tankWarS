package com.tankwar.run;

import com.tankwar.layout.Layout;
import com.tankwar.util.LayoutConstant;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {
        Layout layout = new Layout();
//        layout.setSize(300,400);
        JFrame jFrame = new JFrame("坦克大战");
        jFrame.setSize(LayoutConstant.WITH,LayoutConstant.HIGHT);
        jFrame.add(layout);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.addKeyListener(layout);
        layout.action();
//        jFrame.se
    }
}
