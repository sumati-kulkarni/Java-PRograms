import java.io.*;

class Download implements Runnable
  {
    public void run()
      {
	System.out.println("Start Of Downloading Thread");
	for(int i=10;i>=1;i--)
	  System.out.println("Download : "+i);
	System.out.println("End Of Downloading Thread");
      }
  }

class Print implements Runnable
  {
    public void run()
      {
	System.out.println("Start Of Printing Thread");
	for(int i=10;i<=100;i=i+10)
	  System.out.println("Print : "+i);
	System.out.println("End Of Printing Thread");
      }
  }

class DownloadPrint
  {
    public static void main(String args[])
      {
	System.out.println("Start Of Main");
	Thread t1=new Thread(new Download());
	Thread t2=new Thread(new Print());
	t1.start();
	t2.start();
	for(int i=1;i<=10;i++)
	  System.out.println("Main : "+i);
	System.out.println("End Of Main");
      }
  }