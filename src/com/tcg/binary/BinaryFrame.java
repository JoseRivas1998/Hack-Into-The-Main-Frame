package com.tcg.binary;

import java.awt.Color;

import javax.swing.*;

public class BinaryFrame extends JFrame{
	private static final long serialVersionUID = 853190610791768799L;

	JTextArea label;
	
	public BinaryFrame() {
		setTitle("Hacking into the Main Frame");
		label =  new JTextArea();
		label.setEditable(false);
		getContentPane().add(label);
		label.setForeground(new Color(0, 255, 0));
		label.setBackground(new Color(0, 0, 0));
		label.setHighlighter(null);
		setSize(775, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
//		setResizable(false);
		setVisible(true);
	}

	public void setText(String s) {
		label.setText(s);
	}
	
}
