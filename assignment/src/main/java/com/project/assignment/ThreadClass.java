package com.project.assignment;

public class ThreadClass extends Thread{
	String threadName="";
	
	public ThreadClass(String threadName) {
		this.threadName=threadName;
	}
	@Override
	public void run() {
		System.out.println(threadName + " started.");
        try {
            // Simulate some work with sleep
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " has finished.");
    }
	}
	


