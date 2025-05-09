package com.mcq.multithreading_05_05;

class NIT2 extends Thread
{
	public void display() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");
			
			Thread.sleep(500);
		}
	}
}

class NIT3 extends Thread
{
	public void display1() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			Thread.sleep(1000);
		}
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT2 nit = new NIT2();
		NIT3 nit1 = new NIT3();
		
		nit.start();
		nit1.start();
		
		nit.display();
		nit1.display1();
    }
}
