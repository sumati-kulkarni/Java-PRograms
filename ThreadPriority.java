import java.io.*;

class ThreadPriority implements Runnable
  {
    String msg;
    ThreadPriority(String t)
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
	Thread t1=new Thread(new ThreadPriority("First"));
	Thread t2=new Thread(new ThreadPriority("Second"));
	
	t1.setPriority(10);
	t2.setPriority(1);
	t1.start();
	t2.start();
	System.out.println("End Of main");
      }
  }