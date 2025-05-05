package com.ravi.mcqquestionday4;

public class MultiThread5 extends Thread
{  @Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}

   @Override
   public void start() {
	System.out.print(Thread.currentThread().getName()+" ");
}

	public static void main(String[] args) {
		MultiThread5 nit = new MultiThread5();
		for(int i=0;i<10;i++)
		{
		//	MultiThread5 nit = new MultiThread5();
			//nit.start();
			nit.run();
		}
	}
}
