package com.wolken.wolkenapp.synchronisation;

public class BySynchronisationBlock {
	
	public static void main(String[] args) {
		Multiple multiple = new Multiple();
		
		String s = "Nsh";
		
		T1 t1 = new T1(multiple);
		T2 t2 = new T2(multiple);
		
		t1.start();
		t2.start();
		
		synchronized(s) {
			
		}
	}
	

}

class T1 extends Thread{
	
	Multiple multiple;
	
	public  T1(Multiple multiple) {
		this.multiple = multiple;
	}
	
	@Override
	public void run() {
		multiple.tableOf(5);
	}
	
}

class T2 extends Thread{
	
Multiple multiple;
	
	public  T2(Multiple multiple) {
		this.multiple = multiple;
	}
	
	public void run() {
		multiple.tableOf(5);
	}
		
}

class Multiple{
	void tableOf(int tableOf) {
		synchronized(this) {
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
	
	
}