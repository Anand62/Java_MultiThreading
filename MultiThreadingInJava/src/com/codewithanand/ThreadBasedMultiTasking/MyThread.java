package com.codewithanand.ThreadBasedMultiTasking;
/*
 🔹 (b) Thread-Based Multitasking
✅ Definition: Running multiple threads within a single process (program). Threads share memory and run concurrently.

💡 Real-Life Example
Inside a video editing software:

One thread handles rendering.
One thread plays the video preview.
One thread saves the project.
All these tasks run inside the same software (process).

Example in Java (Running Multiple Threads)
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();  // Starts first thread
        t2.start();  // Starts second thread
    }
}

/*
 
 ✅ Threads run concurrently inside the same process.

🔹 Key Features of Thread-Based Multitasking
✔ Threads share the same memory space.
✔ Faster than process-based multitasking.
✔ Uses less CPU & RAM.
✔ Suitable for parallel tasks in a single application.

*/
