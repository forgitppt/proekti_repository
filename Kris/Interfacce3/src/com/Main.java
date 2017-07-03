package com;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton b1 = new JButton("CLICK1");
		f.add(b1, BorderLayout.CENTER);

		f.setSize(600, 600);
		f.setVisible(true);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setText("You clicked me");
			}
		};
		
		b1.addActionListener(listener);

	}

	
	public static void funkcija5(int PPPPPPP){
		
	}
}
