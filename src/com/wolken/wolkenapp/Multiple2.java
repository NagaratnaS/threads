package com.wolken.wolkenapp;

public class Multiple2 extends Thread{
	
	public void run() {
		System.out.println("Thread id :" +Thread.currentThread().getId());
		System.out.println("Thread name :"+Thread.currentThread().getName());
		
		int num = 13;
		for(int i = 11 ; i<= 20 ; i++) {
			System.out.println(num  + " * " +i + " = "+ (num * i));
		}
		System.out.println("Ending of second thread");
	}
	

}
