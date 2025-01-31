package com.codewithanand.Uniprocessing;
/*
 * Uniprocessing in Java (Single-Threaded Program)
 */
public class UniprocessingExample {
    public static void main(String[] args) {
        System.out.println("Task 1: Downloading file...");
        // Simulate delay
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        
        System.out.println("Task 2: Processing file...");
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        
        System.out.println("Task 3: Saving file...");
    }
}
//✅ Here, tasks execute one after another, like a single-lane bridge.
