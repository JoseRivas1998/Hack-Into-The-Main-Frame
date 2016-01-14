package com.tcg.binary;

public class StringGen {

	public static String generateFrameBinary(int rows, int cols) {
		String s = "";
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				s += generateBinary();
				if(j < cols - 1) {
					s += " ";
				}
			}
			s += "\n";
		}
		
		return s;
	}
	
	public static String generateBinary() {
		
		String s = "";
		for(int i = 0; i < 8; i++) {
			if(Math.random() > .6) {
				s += "0";
			} else {
				s += "1";
			}
		}
		return s;
	}
	
}
