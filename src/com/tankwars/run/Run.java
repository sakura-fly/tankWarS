package com.tankwars.run;

import javax.swing.JFrame;

import com.tankwars.layout.Layout;
import com.tankwars.util.Constants;

public class Run {

	public static void main(String[] args) {

		Layout ly = new Layout();
		JFrame jf = new JFrame(Constants.TITILE);
		ly.setSize(Constants.WITH_PANEL, Constants.HIGHT_PANEL);
		jf.add(ly);
		jf.setVisible(true);
		jf.setSize(Constants.WITH_PANEL, Constants.HIGHT_PANEL);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.addKeyListener(ly);
		ly.action();
	}
}
