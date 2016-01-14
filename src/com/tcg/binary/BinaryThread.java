package com.tcg.binary;

public class BinaryThread extends Thread {
	
	BinaryFrame frame;

	public BinaryThread(BinaryFrame frame) {
		this.frame = frame;
		this.start();
	}
	
	@Override
	public void run() {
		while(true) {
			int numRows = frame.getHeight() / frame.getLineHeight();
			int numCols = frame.getWidth() / frame.getLineWidth();
			this.frame.setText(StringGen.generateFrameBinary(numRows, numCols));
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
