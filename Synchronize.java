import java.io.*;

class MyThread implements Runnable
{
    String msg="";
	
	public void run()
    {
		System.out.println("Start Of "+msg+" Thread");
		disp();
		System.out.println("End Of "+msg+" Thread");
    }
	
	synchronized void disp()
	{
		for(int i=1;i<=10;i++)
			System.out.println(msg + " "+i);
	}
	
	MyThread(String t)
	{
		msg =t;
	}
}

class Synchronize
{
    public static void main(String args[])
      {
	System.out.println("Start Of Main thread");
	Thread t1=new Thread(new MyThread("First"));
	Thread t2=new Thread(new MyThread("Second"));
	t1.start();
	t2.start();
	System.out.println("End Of main");
      }
  }