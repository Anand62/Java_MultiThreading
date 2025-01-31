package com.codewithanand.allMethodOfThread;
/* 2. Thread Sleeping (Pausing Execution)

 * Method: sleep(milliseconds)

Example Scenario:
A traffic signal system where the light changes after a fixed time.
 */

class TrafficSignal extends Thread {
    public void run() {
        String[] lights = {"RED", "YELLOW", "GREEN"};
        for (String light : lights) {
            System.out.println("Traffic Light: " + light);
            try {
                Thread.sleep(3000);  // Pause for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class sleep_TrafficSignalSystem {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        signal.start(); 
    }
}
//✔ Use: Simulates timed execution (like changing traffic lights).
