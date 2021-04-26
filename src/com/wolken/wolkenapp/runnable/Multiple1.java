package com.wolken.wolkenapp.runnable;

public class Multiple1 implements Runnable{
	public void run() {
		System.out.println("Thread id:" +Thread.currentThread().getId());
		System.out.println("Thread Name:" +Thread.currentThread().getName());
		
		int num = 13;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(num +" * " + i +" = " +(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Ending of first thread");
	}

}
