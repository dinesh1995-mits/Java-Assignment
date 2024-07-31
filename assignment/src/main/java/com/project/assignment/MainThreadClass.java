package com.project.assignment;

/**
 * Task 2: There are 5 threads, T1,T2,T3,T4,T5
T5 should begin processing only after all the remaining threads finish processing
 *
 */
public class MainThreadClass {
	public static void main(String[] args) {
		
	
    ThreadClass T1 = new ThreadClass("Thread T1");
    ThreadClass T2 = new ThreadClass("Thread T2");
    ThreadClass T3 = new ThreadClass("Thread T3");
    ThreadClass T4 = new ThreadClass("Thread T4");
    ThreadClass T5 = new ThreadClass("Thread T5");

    T1.start();
    T2.start();
    T3.start();
    T4.start();

    try {
        T1.join();
        T2.join();
        T3.join();
        T4.join();
    } catch (InterruptedException e) {
        System.out.println("Main thread interrupted.");
    }

    T5.start();
    
    try {
     
        T5.join();
    } catch (InterruptedException e) {
        System.out.println("Main thread interrupted.");
    }

    System.out.println("All threads have finished processing.");
	}

}
