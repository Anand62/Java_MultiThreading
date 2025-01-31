package com.codewithanand.allMethodOfThread;
/*
 * 2. activeCount()
Description:
This static method returns the number of active threads in the current thread's thread group.

Analogy:
Consider a classroom where the teacher wants to know how many students are 
currently present. They can take a quick headcount to determine the number of 
active participants.
 */
public class activeCount_Method {
	    public static void main(String[] args) {
	        System.out.println("Active Threads: " + Thread.activeCount());
	    }
	}
/*
Use Case:
This method is useful for monitoring and managing the number of active threads, especially in applications that dynamically create and terminate threads.
*/