package com.wolken.wolkenapp;

public class Multiple1 extends Thread{
	
	public void run() {
		System.out.println("Thread id:" +Thread.currentThread().getId());
		System.out.println("Thread Name:" +Thread.currentThread().getName());
		
		int num = 10;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(num +" * " + i +" = " +(num*i));
		}
		// This is a comment
		//New branch comment
		System.out.println("Ending of first thread");
	}

}
