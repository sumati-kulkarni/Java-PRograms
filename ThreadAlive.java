import java.io.*;

class ThreadAlive implements Runnable
  {
    String msg;
    ThreadAlive(String t)
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
	Thread t1=new Thread(new ThreadAlive("First"));
	Thread t2=new Thread(new ThreadAlive("Second"));
	t1.start();
	t2.start();
	while(t1.isAlive());
	while(t2.isAlive());
	System.out.println("End Of Main Thread");
      }
  }