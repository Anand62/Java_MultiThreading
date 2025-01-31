package com.codewithanand.ProcessBasedMultiTasking;
/*
 🔹 (a) Process-Based Multitasking
✅ Definition: Running multiple processes (programs) at the same time. Each process has its own memory space.

💡 Real-Life Example
Imagine you are using:

	Chrome for browsing
	VS Code for coding
	Spotify for music
Each application is a separate process, running independently.


 Example in Java (Running Multiple Processes)
 */

import java.io.*;

public class ProcessBasedExample {
	public static void main(String[] args) {
		try {
			// Running a new process (Opening Notepad)
            Process process = Runtime.getRuntime().exec("C:/Program Files/Google/Chrome/Application/chrome.exe");
            Process process1 = Runtime.getRuntime().exec("notepad.exe");
            Process process2 = Runtime.getRuntime().exec("cmd.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//✅ Here, Java launches Notepad, Chrome as a separate process simultaneously.


/*
 Why is it Process-Based Multitasking?
Separate Processes:

Each command (chrome.exe, notepad.exe, cmd.exe) starts a new independent process.
Each process has its own memory and resources.
Independent Execution:

These processes run separately, and their execution is not dependent on each other.
If one process (e.g., Chrome) crashes, the others (Notepad or Command Prompt) are unaffected.
Example in Real Life:

When you open a browser, Notepad, and a command prompt manually, each of them is a separate process.
The operating system handles these processes individually, providing multitasking at the process level.
 
 
 
Comparison with Thread-Based Multitasking
	In Thread-Based Multitasking, tasks (threads) share the same memory space and belong to a single process.
	In your example, you're creating multiple processes instead of threads, so it's process-based multitasking.
 
 
 
 Output for Your Code
When you run the code:

Google Chrome opens.
Notepad starts.
Command Prompt (cmd.exe) launches.
The system handles these as separate processes, and they execute concurrently.
 *
 */



/*
🔹 Key Features of Process-Based Multitasking
✔ Each process has its own memory space.
✔ Processes do not share resources directly.
✔ Heavier compared to threads (more CPU & RAM usage).
✔ Slower due to context switching between processes.
 */
