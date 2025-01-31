package com.codewithanand.allMethodOfThread;
/*
 * 1. Creating and Starting a Thread
 * 
 * Methods:
	start()
	run()
	
Example Scenario:
A video streaming app (like YouTube) needs to buffer the next part of a video while playing the current part.


 */

class VideoBuffer extends Thread {
	public void run() {
		System.out.println("Buffering next part of the video...");
	}
}

public class start_run_VideoStreamingApp {
	public static void main(String[] args) throws InterruptedException {
		VideoBuffer bufferThread = new VideoBuffer();

		bufferThread.start(); // Calls the run() method asynchronously
		System.out.println("Playing video...");

	}
}

//✔ Use: Runs two tasks at the same time (playing and buffering).
