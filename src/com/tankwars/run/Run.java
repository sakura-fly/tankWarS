package com.tankwars.run;

import javax.swing.JFrame;

import com.tankwars.model.Layout;
import com.tankwars.util.Constants;

public class Run {


	public static void main(String[] args) {
		Layout ly = new Layout();
		JFrame jf = new JFrame(Constants.TITILE);
		jf.add(ly);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(Constants.WITH_PANEL, Constants.HIGHT_PANEL);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.addKeyListener(ly);
		ly.action();;
	}
}