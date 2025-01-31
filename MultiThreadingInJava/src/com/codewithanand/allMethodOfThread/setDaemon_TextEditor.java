package com.codewithanand.allMethodOfThread;
/*
 * Real-Life Application of isDaemon() and setDaemon(true)
Scenario: Auto-Backup Service in a Text Editor
Imagine a text editor (like Notepad or MS Word) that has an auto-save feature running in the background. The main application thread handles user input, while a daemon thread automatically saves progress every few seconds. If the user closes the editor, the daemon thread stops running because it's a background process.
 */

class AutoSave01 extends Thread {
	public void run() {
		while (true) {
			System.out.println("Auto-saving document...");
			try {
				Thread.sleep(3000); // Simulate auto-save every 3 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class setDaemon_TextEditor {
	public static void main(String[] args) throws InterruptedException {
		AutoSave01 autoSaveThread = new AutoSave01();
		autoSaveThread.setDaemon(true); // Mark as daemon thread
		autoSaveThread.start();

		// Simulating user working on a document
		for (int i = 5; i > 0; i--) {
			System.out.println("User editing document... " + i);
			Thread.sleep(2000);
		}

		System.out.println("User closes the text editor. Main thread ends.");
		// Daemon thread will automatically stop when main thread exits
	}
}

/*
 * Explanation:
The auto-save feature runs in a separate daemon thread.
It saves progress every 3 seconds while the user is editing.
When the user closes the editor (main thread ends), the daemon thread automatically stops (no need for manual interruption).
 */

/*
 * Other Real-World Uses of Daemon Threads
	1. Garbage Collection (GC in JVM)
	2. Auto-updates & Syncing (Google Drive, OneDrive)
	3. Background Notifications in Chat Apps
 */



/*
Where isDaemon() Used?
Before marking the thread as a daemon, you could check if it’s already a daemon using:


System.out.println("Is AutoSave Daemon? " + autoSaveThread.isDaemon());

💡 Why Use a Daemon Thread? ✔ Runs in the background without blocking the application
✔ Stops automatically when the app is closed
✔ Ideal for non-critical tasks (like auto-save, logging, cleanup)
*/