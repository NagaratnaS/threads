package com.wolken.wolkenapp.utilities;

public class UtilityDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("active number of threads :" +Thread.activeCount());
		Thread thread = Thread.currentThread();
		
		System.out.println("Thread id:" +thread.getId());
		System.out.println("Thread Name:" +thread.getName());
		System.out.println("Thread Priority:" +thread.getPriority());
		System.out.println("Thread State:" +thread.getState());
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("hello" +i);
			System.out.println("Thread state :" +thread.getState());
			
			Thread.sleep(1000);
		}
		
		System.out.println("Thread state:" +thread.getState());
		

	}

}
