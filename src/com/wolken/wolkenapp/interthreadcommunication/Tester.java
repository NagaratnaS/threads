package com.wolken.wolkenapp.interthreadcommunication;

public class Tester {
	public static void main(String[] args) {
		GroceryPurchase grocery = new GroceryPurchase();
		
		
		Thread1 thread1 = new Thread1(grocery);
		Thread2 thread2 = new Thread2(grocery);
		
		thread1.start();
		thread2.start();
	}
	

}

class Thread1 extends Thread{
	GroceryPurchase grocery;
	public Thread1(GroceryPurchase grocery) {
		this.grocery = grocery;
	}
	
	@Override
	public void run() {
		grocery.purchaseGrocery(5);
	}
}

class Thread2 extends Thread{
	GroceryPurchase grocery;
	public Thread2(GroceryPurchase grocery) {
		this.grocery = grocery;
	}
	
	@Override
	public void run() {
		grocery.waitForSixAm();
	}
}

class GroceryPurchase{
	int startTime = 6;
	int endTime = 10;
	
	synchronized void purchaseGrocery(int currentTime) {
		System.out.println("Going to purchase groceries");
		if(currentTime < 6 || currentTime > 10) {
			try {
				wait();
				System.out.println("waiting...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("yet to purchase");
		
	}
	
	synchronized void waitForSixAm() {
		System.out.println("Waiting for 6AM");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("current time is 6am");
		notify();
	}
}
