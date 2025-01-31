package com.codewithanand.allMethodOfThread;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Theater01 {
    private int availableSeats = 5; // Total available seats

    // Synchronized method to prevent overbooking
    public synchronized void bookSeat(String userName, int seatsToBook, JTextArea outputArea) {
        outputArea.append(userName + " is trying to book " + seatsToBook + " seat(s)...\n");

        if (seatsToBook > availableSeats) {
            outputArea.append("❌ Not enough seats available for " + userName + "\n\n");
            return;
        }

        outputArea.append(userName + " is processing booking...\n");

        // Yielding to give another thread a chance
        Thread.yield();

        availableSeats -= seatsToBook;
        outputArea.append("✅ " + userName + " successfully booked " + seatsToBook + " seat(s).\n");
        outputArea.append("Seats left: " + availableSeats + "\n\n");
    }
}

class User02 extends Thread {
    private Theater01 theater;
    private String userName;
    private int seatsToBook;
    private JTextArea outputArea;

    User02(Theater01 theater, String userName, int seatsToBook, JTextArea outputArea) {
        this.theater = theater;
        this.userName = userName;
        this.seatsToBook = seatsToBook;
        this.outputArea = outputArea;
    }

    public void run() {
        theater.bookSeat(userName, seatsToBook, outputArea);
    }
}

public class yield_TicketBookingApp3 extends JFrame {
    private Theater01 theater = new Theater01(); // Shared theater instance
    private JTextField nameField, seatField;
    private JTextArea outputArea;

    public yield_TicketBookingApp3() {
        setTitle("Theater Seat Booking");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("User Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Seats to Book:"));
        seatField = new JTextField();
        inputPanel.add(seatField);

        JButton bookButton = new JButton("Book Seat");
        inputPanel.add(bookButton);

        add(inputPanel, BorderLayout.NORTH);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button Click Event
        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = nameField.getText();
                int seatsToBook;

                try {
                    seatsToBook = Integer.parseInt(seatField.getText());
                } catch (NumberFormatException ex) {
                    outputArea.append("❌ Please enter a valid number of seats!\n\n");
                    return;
                }

                // Creating a new user thread for booking
                User02 userThread = new User02(theater, userName, seatsToBook, outputArea);
                userThread.start();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new yield_TicketBookingApp3().setVisible(true);
        });
    }
}
