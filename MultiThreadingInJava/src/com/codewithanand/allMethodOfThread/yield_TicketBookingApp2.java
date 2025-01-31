package com.codewithanand.allMethodOfThread;
class Theater {

    private int availableSeats = 5; // Total seats available
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String MAGENTA = "\u001B[35m";
    // Synchronized method to prevent race conditions
    public synchronized void bookSeat(String userName, int seatsToBook) {
        System.out.println(MAGENTA+userName + " is trying to book " + seatsToBook + " seat(s)...");

        if (seatsToBook > availableSeats) {
            System.out.println(RED+"❌ Not enough seats available for " + userName);
            return;
        }

        System.out.println("\u001B[33m"+userName + " is processing booking...");

        // Simulating delay, allowing other users to get a chance
        Thread.yield();  

        availableSeats -= seatsToBook;
        System.out.println(GREEN+"✅ " + userName + " successfully booked " + seatsToBook + " seat(s).");
        System.out.println("Seats left: " + availableSeats);
    }
}

class User01 extends Thread {
    private Theater theater;
    private String userName;
    private int seatsToBook;

    User01(Theater theater, String userName, int seatsToBook) {
        this.theater = theater;
        this.userName = userName;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        theater.bookSeat(userName, seatsToBook);
    }
}

public class yield_TicketBookingApp2 {
    public static void main(String[] args) {
        Theater theater = new Theater(); // Shared theater instance

        // Multiple users booking seats
        User01 user1 = new User01(theater, "Alice", 2);
        User01 user2 = new User01(theater, "Bob", 3);
        User01 user3 = new User01(theater, "Charlie", 2); // Will fail due to no seats left

        user1.start();
        user2.start();
        user3.start();
    }
}
