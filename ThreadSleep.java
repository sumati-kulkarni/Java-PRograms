import java.io.*;

class ThreadSleep implements Runnable
  {
    String msg;
    ThreadSleep(String t)
      {
	msg=t;
      }
    public void run()
      {
	System.out.println("Start Of "+msg+" Thread");
	for(int i=1;i<=10;i++)
	  System.out.println(msg+i);
	System.out.println("End Of "+msg+" Thread");
      }
    public static void main(String args[])
      {
	System.out.println("Start Of Main thread");
	Thread t1=new Thread(new ThreadSleep("First"));
	Thread t2=new Thread(new ThreadSleep("Second"));
	t1.start();
	t2.start();
	try
	{
		Thread.sleep(5000);
	}catch(InterruptedException e)
	{
		System.out.println("Error : "+e);
	}
	System.out.println("End Of main");
      }
  }