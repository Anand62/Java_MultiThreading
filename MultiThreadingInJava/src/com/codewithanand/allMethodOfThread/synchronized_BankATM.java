package com.codewithanand.allMethodOfThread;
/*
 * 6. Thread Synchronization (Preventing Conflicts)
Method: synchronized

Example Scenario:
A shared ATM allows only one user to withdraw money at a time.
 */

class ATM {
	synchronized void withdrawMoney(String user) {
		System.out.println(user + " is withdrawing money...");
		try {
			Thread.sleep(3000); // Simulating ATM processing time
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(user + " has withdrawn money.");
	}
}

class User extends Thread {
	ATM atm;
	String user;

	public User(ATM atm, String user) {
		this.atm = atm;
		this.user = user;
	}

	public void run() {
		atm.withdrawMoney(user);
	}
}

public class synchronized_BankATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		User user1 = new User(atm, "Alice");
		User user2 = new User(atm, "Bob");

		user1.start();
		user2.start();
	}
}
//✔ Use: Prevents race conditions (when two users try to withdraw at the same time).