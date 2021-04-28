package com.wolken.wolkenapp.synchronisation;

public class StaticSynchronisation {
	public static void main(String[] args) {
//		Addition addition = new Addition();
//		Addition addition2 = new Addition();
		
		N1 n1 = new N1();
		N2 n2 = new N2();
		N3 n3 = new N3();
		N4 n4 = new N4();
		
		n1.start();
		n2.start();
		n3.start();
		n4.start();
	}
	
}

class N1 extends Thread{
//	Addition addition;
//	public N1(Addition addition) {
//		this.addition = addition;
//	}
//	
	@Override
	public void run() {
		Addition.addNumber(5);
	}
	
}

class N2 extends Thread{
//	Addition addition;
//	
//	public N2(Addition addition) {
//		this.addition = addition;
//	}
//	
	@Override
	public void run() {
		Addition.addNumber(10);
	}
}

class N3 extends Thread{
//	Addition addition;
//	
//	public N3(Addition addition) {
//		this.addition = addition;
//	}
	
	@Override
	public void run() {
		Addition.addNumber(1);
	}
}

class N4 extends Thread{
//	Addition addition;
//	
//	public N4(Addition addition) {
//		this.addition = addition;
//	}
	
	@Override
	public void run() {
		Addition.addNumber(200);
	}
}

class Addition{
	synchronized static void addNumber(int number) {
			int temp = 0;
			for(int i = 0 ; i < 10 ; i++) {
				temp = temp + number;
				System.out.println("number is" + temp);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}