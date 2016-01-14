package com.tcg.binary;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;

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
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void setText(String s) {
		label.setText(s);
	}
	
	public int getLineHeight() {
		
		FontRenderContext frc = ((Graphics2D) this.getGraphics()).getFontRenderContext();

        GlyphVector gv = ((Graphics2D) this.getGraphics()).getFont().createGlyphVector(frc, StringGen.generateBinary());
        
        return gv.getPixelBounds(null, 0, 0).height;
	}
	
	public int getLineWidth() {
		
		FontRenderContext frc = ((Graphics2D) this.getGraphics()).getFontRenderContext();

        GlyphVector gv = ((Graphics2D) this.getGraphics()).getFont().createGlyphVector(frc, StringGen.generateBinary());
        
        return gv.getPixelBounds(null, 0, 0).width;
	}
	
}
