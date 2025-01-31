package com.codewithanand.Multitasking;

class Task1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("📌 UI Updating...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("💾 Auto-saving Document...");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadMultitasking {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        
        t1.start();
        t2.start();
    }
}

