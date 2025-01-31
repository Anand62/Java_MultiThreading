package com.codewithanand.allMethodOfThread;
/*
 * 1. currentThread()
Description:
This static method returns a reference to the currently executing thread object.

Analogy:
Imagine you're in a large conference with multiple speakers. If each speaker wants to know who is currently speaking, they can call out, "Who is speaking now?" and get a response indicating the current speaker.
 */
public class CurrentThread_Example {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread: " + thread.getName());
	}
}
/*
 * Use Case:
This method is particularly useful for obtaining information about the thread that is currently executing, which can aid in debugging and logging.
*/
