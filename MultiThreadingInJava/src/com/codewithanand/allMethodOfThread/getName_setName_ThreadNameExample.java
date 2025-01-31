package com.codewithanand.allMethodOfThread;
/*
 * 4. getName() and setName(String name)
Description:
getName() retrieves the name of the thread, while setName() assigns a new name to the thread.

Analogy:
In a team project, each member (thread) has a specific role (name). Assigning and retrieving these roles helps in organizing and identifying responsibilities.
 */
public class getName_setName_ThreadNameExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Original Name: " + thread.getName());
        thread.setName("MainApplicationThread");
        System.out.println("Updated Name: " + thread.getName());
    }
}

/*
Use Case:
Naming threads can make debugging and logging more intuitive by providing meaningful identifiers for each thread.
*/