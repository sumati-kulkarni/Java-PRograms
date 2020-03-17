import java.io.*;

class ThreadSuspendResume implements Runnable
  {
    String msg;
    ThreadSuspendResume(String t)
      {
	msg=t;
      }
    public void run()
      {
	System.out.println("Start Of "+msg+" Thread");
	for(int i=1;i<=100;i++)
	  System.out.println(msg+i);
	System.out.println("End Of "+msg+" Thread");
      }
    public static void main(String args[])
      {
	System.out.println("Start Of Main thread");
	Thread t1=new Thread(new ThreadSuspendResume("First"));
	Thread t2=new Thread(new ThreadSuspendResume("Second"));
	t1.start();
	t2.start();
	try
	{
		int flag=0;
		t2.suspend();
		while(t1.isAlive() && t2.isAlive())
		{
			if(flag==0)
			{
				t1.suspend();
				t2.resume();
				flag=1;
			}
			else
			{
				t1.resume();
				t2.suspend();
				flag=0;
			}
		}
			Thread.sleep(5000);
			if(t1.isAlive())
				t1.resume();
			if(t2.isAlive())
				t2.resume();
	}catch(Exception e)
	{
		System.out.println("Error : "+e);
	}
	System.out.println("End Of main");
      }
  }