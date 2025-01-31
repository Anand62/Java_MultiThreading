package com.codewithanand.allMethodOfThread;
/*
 * 3. Making a Thread Wait Until Another Completes
 * 
 * Method: join()

Example Scenario:
A restaurant waiter must wait for the chef to finish cooking before serving the dish.
 */

class Chef extends Thread {
    public void run() {
        System.out.println("Chef: Cooking food...");
        try {
            Thread.sleep(5000);  // Simulate cooking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef: Food is ready!");
    }
}

class Waiter extends Thread {
    private Thread chefThread;

    public Waiter(Thread chefThread) {
        this.chefThread = chefThread;
    }

    public void run() {
        try {
            chefThread.join();  // Wait for chef to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Waiter: Serving food to customer...");
    }
}

public class join_Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter(chef);

        chef.start();
        waiter.start();
    }
}

//✔ Use: Ensures tasks execute in the correct sequence.