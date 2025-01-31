package com.codewithanand.allMethodOfThread;
/*
 * 7. Stopping a Thread
Methods:

interrupt()
isInterrupted()
Example Scenario:
A gaming app stops a background auto-save when the player quits.
 */

class AutoSave extends Thread {
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("Auto-saving game progress...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("Auto-save stopped.");
	}
}

public class interrupt_Game {
	public static void main(String[] args) throws InterruptedException {
		AutoSave saveThread = new AutoSave();
		saveThread.start();

		Thread.sleep(5000); // Simulate player playing
		System.out.println("Player quits the game.");
		saveThread.interrupt(); // Stop auto-saving
	}
}
//✔ Use: Stops background tasks when they are no longer needed.
