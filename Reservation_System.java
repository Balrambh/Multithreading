package com.practice.multhreading;
class primimum implements Runnable{
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name +" :Booking the  general ticket :");
	}
	
	
}

class General implements Runnable{
	
	@Override
	public void run() {
		String   name =Thread.currentThread().getName();
		System.out.println(name +" :Booking the General ticket :");
	}
}
class tatkal implements Runnable{
	
	
	@Override
	public void run() 
	{
		String name =Thread.currentThread().getName();
		System.out.println(name +" :Booking the Tatkal Ticket :");
	}
}

public class Reservation_System {
  public static void main(String[] args) throws InterruptedException {
	

	Thread vipin = new Thread( new primimum(),"Vipin");
	Thread nikhu = new Thread( new General(),"Nikhil");
	Thread zamal = new Thread( new tatkal(),"Zamal");
	vipin.start();
	vipin.join();
	nikhu.start();
	nikhu.join();
	zamal.start();
	
	
}
}
