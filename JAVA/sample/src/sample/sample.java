package sample;

import java.awt.Image;
import java.awt.Toolkit;
import java. awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleMain sm = new sampleMain();
		aftersample sa = new aftersample();
		
		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sm.setBounds(450, 250, 500, 400);
		
		sa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sa.setBounds(450, 250, 500, 400);
		
		
		sm.setLayout(null);
		//sm.setVisible(true);
		
		sa.setLayout(null);
		sa.setVisible(true);
	}

}
