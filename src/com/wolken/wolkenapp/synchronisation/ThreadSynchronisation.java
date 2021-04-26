package com.wolken.wolkenapp.synchronisation;

public class ThreadSynchronisation {
	public static void main(String[] args) {
		System.out.println("Thread id :" +Thread.currentThread().getId());
		System.out.println("Thread name :" +Thread.currentThread().getName());
		Thread1 t1 = new Thread1();
		Thread thread1 = new Thread(t1);
		System.out.println("Thread 1" +thread1.getState());
		Thread2 thread2 = new Thread2();
		System.out.println("Thread 2" +thread2.getState());
		thread1.start();
		thread2.start();
		System.out.println("ending of thread" +Thread.currentThread().getName());
		}
}
class Thread1 implements Runnable{
	Table t = new Table();
	@Override
	public void run() {
		System.out.println("Thread id:" +Thread.currentThread().getId());
		System.out.println("Thread name:" +Thread.currentThread().getName());
		System.out.println("Thread 1" +Thread.currentThread().getState());
		t.tableOf(12);
		System.out.println("ending of thread1"+Thread.currentThread().getName());
	}
}

class Thread2 extends Thread{
	Table t = new Table();
	@Override
	public void run() {
		System.out.println("Thread id:" +Thread.currentThread().getId());
		System.out.println("Thread name:" +Thread.currentThread().getName());
		System.out.println("Thread 2" +Thread.currentThread().getState());
		t.tableOf(21);
		System.out.println("ending of thread2"+Thread.currentThread().getName());
	}
}

class Table{
	synchronized void tableOf(int tableOf) {
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(tableOf +" * " + i + " = " + tableOf*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
	
	
