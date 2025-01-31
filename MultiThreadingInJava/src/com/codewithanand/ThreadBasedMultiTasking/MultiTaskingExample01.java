package com.codewithanand.ThreadBasedMultiTasking;
/*
 * Thread-Based Multitasking in Java, we can create an example of a single app performing the following tasks concurrently:

Handling UI updates (simulated by periodic messages).
Saving a file (simulated by a file-writing operation).
Processing data (simulated by a computation task).
 */

//Import necessary packages
import java.io.FileWriter;
import java.io.IOException;

class UIThread extends Thread {
	public void run() {
		// Simulate UI updates
		for (int i = 0; i < 5; i++) {
			System.out.println("UI is updating...");
			try {
				Thread.sleep(1000); // Simulate delay in UI updates
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FileSavingThread extends Thread {
	public void run() {
		// Simulate file saving
		try (FileWriter writer = new FileWriter("output.txt")) {
			writer.write("Saving file content...\n");
			for (int i = 0; i < 5; i++) {
				writer.write("File saved at step: " + (i + 1) + "\n");
				System.out.println("File saving in progress...");
				Thread.sleep(1500); // Simulate delay in file saving
			}
			System.out.println("File saving complete!");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DataProcessingThread extends Thread {
	public void run() {
		// Simulate data processing
		for (int i = 0; i < 5; i++) {
			System.out.println("Processing data chunk: " + (i + 1));
			try {
				Thread.sleep(2000); // Simulate delay in processing
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data processing complete!");
	}
}

public class MultiTaskingExample01 {
	public static void main(String[] args) {
		// Create thread objects
		UIThread uiThread = new UIThread();
		FileSavingThread fileThread = new FileSavingThread();
		DataProcessingThread processingThread = new DataProcessingThread();

		// Start the threads
		uiThread.start();
		fileThread.start();
		processingThread.start();
	}
}

/*
Key Points
This program uses threads to handle different tasks within the same app.
Each task runs independently, demonstrating thread-based multitasking.
Suitable for scenarios like modern applications where UI, file operations, and background computations run in parallel.
*/