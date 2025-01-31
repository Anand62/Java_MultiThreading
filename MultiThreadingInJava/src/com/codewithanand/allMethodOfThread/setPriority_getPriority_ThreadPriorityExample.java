package com.codewithanand.allMethodOfThread;
/*
5. getPriority() and setPriority(int newPriority)
Description:
getPriority() retrieves the thread's priority, while setPriority() assigns a new priority to the thread.

Analogy:
In emergency services, calls are prioritized based on urgency. High-priority calls are attended to before lower-priority ones. Similarly, thread priorities can influence the order of execution.
*/
public class setPriority_getPriority_ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Original Priority: " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated Priority: " + thread.getPriority());
    }
}

/*Use Case:
Adjusting thread priorities can help manage the execution order of threads, ensuring that critical tasks receive more CPU time.

*/