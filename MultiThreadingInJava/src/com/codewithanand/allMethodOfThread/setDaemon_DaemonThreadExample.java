package com.codewithanand.allMethodOfThread;

public class setDaemon_DaemonThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
//            	System.out.println("Thread name :"+Thread.currentThread().getName());
                System.out.println("Daemon thread running...");

            }
        });
        thread.setDaemon(true);
        thread.start();
//        thread.setPriority(10);
        System.out.println("Main thread ending...");
    }
}
