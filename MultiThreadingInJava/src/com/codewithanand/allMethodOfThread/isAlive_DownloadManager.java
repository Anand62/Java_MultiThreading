package com.codewithanand.allMethodOfThread;
/*
 * 4. Checking Thread Status
 * 
 * Methods:

isAlive() → Checks if a thread is still running.
getState() → Gets the current state of the thread.
Example Scenario:
A file downloader shows the status of a download.
 * 
 * 
 */

class FileDownloader extends Thread {
	public void run() {
		System.out.println("Downloading file...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Download complete!");
	}
}

public class isAlive_DownloadManager {
	public static void main(String[] args) throws InterruptedException {
		FileDownloader download = new FileDownloader();
		download.start();
		download.setPriority(10);
		while (download.isAlive()) {
			System.out.println("Download is still in progress...");
			Thread.sleep(1000);
		}

		System.out.println("Download finished. You can open the file now.");
	}
}

//✔ Use: Helps track task status (like showing progress in an app).