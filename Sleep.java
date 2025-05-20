package com.ravisir.examplequestion;

public class Sleep extends Thread {
	@Override
    public void run() 
    {
    	for(int i=1; i<=10; i++)
    	{
    		System.out.println("i value is :"+i);
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{
    			System.err.println("Catch Block");
                System.out.println(e);
    		}
    	}
    }
}


