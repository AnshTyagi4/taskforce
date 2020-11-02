package com.ansh.tyagi;

 class  counter
 {
	 int count;
	 public synchronized void increment() 
	 {
		 count++;
	 }
 }
public class teacher 
{
	public static void main(String[] args) throws Exception
	{
		counter B = new counter();
		Thread t1 = new Thread(new Runnable()
				{
			      public void run()
			      {
			    	  for(int i =0; i<=1000; i++ )
			    	  {
			    		  B.increment();
			    	  }
			      }
				});
		Thread t2 = new Thread(new Runnable()
		{
	      public void run()
	      {
	    	  for(int j =0; j<=1000; j++ )
	    	  {
	    		  B.increment();
	    	  }
	      }
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	    System.out.println("count --" + B.count);
	}
}