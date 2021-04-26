package com.wolken.wolkenapp.runnable;

import com.wolken.wolkenapp.Multiple1;
import com.wolken.wolkenapp.Multiple2;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread name :" +Thread.currentThread().getName());
		
		Multiple1 multi1 = new Multiple1();
		Thread thread1 = new Thread(multi1);
		
		Multiple2 multi2 = new Multiple2();
		Thread thread2 = new Thread(multi2);
		
		thread1.start();
		
		
		thread2.start();

	}

}
