import java.io.*;

class ThreadJoin implements Runnable
  {
    String msg;
    ThreadJoin(String t)
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
	Thread t1=new Thread(new ThreadJoin("First"));
	Thread t2=new Thread(new ThreadJoin("Second"));
	t1.start();
	t2.start();
	try
	{
		t1.join();
		t2.join();
	}catch(InterruptedException e)
	{
		System.out.println("Error : "+e);
	}
	System.out.println("End Of main");
      }
  }