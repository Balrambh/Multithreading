package com.ravisir.ExampleDay2;

public class AnontmousWithThreadConstructor {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable()    //Anonymous inner class
		{
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Thread name is :"+name);				
			}				
		});
		
		t1.start();

	}

}