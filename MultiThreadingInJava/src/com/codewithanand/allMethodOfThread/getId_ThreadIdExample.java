package com.codewithanand.allMethodOfThread;

/*
 * 3. getId()
Description:
Returns the unique identifier of the thread.

Analogy:
Every citizen has a unique identification number (like a Social Security Number) that distinguishes them from others. Similarly, each thread has a unique ID.
 */
public class getId_ThreadIdExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Thread ID: " + thread.getId());
	}
}

/*
Use Case:
Retrieving a thread's ID is beneficial for logging and tracking purposes, especially when diagnosing concurrency issues.
*/