package com.wolken.wolkenapp;

public class Tester {
	public static void main(String args[]) {
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread name :" +Thread.currentThread().getName());
		
		Multiple1 multi1 = new Multiple1();
		Multiple2 multi2 = new Multiple2();
		multi1.start();
		
		
		multi2.start();

	}
}
