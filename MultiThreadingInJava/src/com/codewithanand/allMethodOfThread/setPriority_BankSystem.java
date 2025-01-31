package com.codewithanand.allMethodOfThread;
/* 5. Thread Priority
 * Method: setPriority(int priority)

Example Scenario:
A bank system prioritizes transactions based on their urgency.
 */


class BankTransaction extends Thread {
    private String transactionType;

    public BankTransaction(String transactionType) {
        this.transactionType = transactionType;
    }

    public void run() {
        System.out.println(transactionType + " is being processed...");
    }
}

public class setPriority_BankSystem {
    public static void main(String[] args) {
        BankTransaction urgentTransaction = new BankTransaction("Urgent Payment");
        BankTransaction normalTransaction = new BankTransaction("Normal Payment");

        urgentTransaction.setPriority(Thread.MAX_PRIORITY);
        normalTransaction.setPriority(Thread.MIN_PRIORITY);

        urgentTransaction.start();
        normalTransaction.start();
    }
}
//✔ Use: Gives higher priority to important tasks (like payments in banking apps).