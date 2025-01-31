package com.codewithanand.allMethodOfThread;
/*
 * Real-Life Application of yield() in Java
Scenario: Multi-User Ticket Booking System
Imagine an online ticket booking system where multiple users are trying to book tickets simultaneously.

If a user takes too long to complete their booking, the system pauses their thread and allows another user’s booking process to proceed.
This prevents one user from blocking others, improving responsiveness.
 */

class TicketBooking extends Thread {
	private String userName;

	TicketBooking(String userName) {
		this.userName = userName;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(userName + " is booking ticket " + i);

			if (i == 2) { // Yield at the second booking attempt
				System.out.println(userName + " is yielding...");
				Thread.yield(); // Give a chance to other users
			}
		}
		System.out.println(userName + " has completed booking.");
	}
}

public class yield_TicketBookingApp {
	public static void main(String[] args) {
		TicketBooking user1 = new TicketBooking("Alice");
		TicketBooking user2 = new TicketBooking("Bob");

		user1.start();
		user2.start();
	}
}
//(⚡ Note: Since yield() depends on the thread scheduler, the order may vary.)

/*
Explanation:
Two users (Alice & Bob) try to book tickets simultaneously.
After booking 2 tickets, a user yields, allowing the other user’s booking process to proceed.
This ensures fair execution, preventing one user from monopolizing the system.

*/

/*
 Why Use yield()?
✔ Prevents one thread from hogging resources
✔ Allows other tasks to execute fairly
✔ Useful in multi-user systems, gaming, and real-time apps
*/

/*
 * Other Real-World Uses of yield()
Video Streaming: If one video stream is buffering, it yields to another stream.
Gaming AI: A game bot yields to another bot’s move, ensuring fair play.
CPU Load Balancing: Threads yield to distribute processing fairly.
*/
