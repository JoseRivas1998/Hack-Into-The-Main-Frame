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
			this.frame.setText(StringGen.generateFrameBinary(50, 25));
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
