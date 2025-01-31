package com.codewithanand.Multitasking;

import java.io.*;

public class ProcessMultitasking {
	public static void main(String[] args) {
		try {
			// Launching multiple processes
			Process chrome = Runtime.getRuntime().exec("C:/Program Files/Google/Chrome/Application/chrome.exe");
			Process notepad = Runtime.getRuntime().exec("notepad.exe");

			System.out.println("Chrome & Notepad launched as separate processes.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
