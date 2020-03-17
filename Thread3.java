import java.io.*;

class Thread3 implements Runnable
  {
    public void run()
      {
	System.out.println("Start Of Run");
	for(int i=10;i>=1;i--)
	  System.out.println("Run : "+i);
	System.out.println("End Of Run");
      }
    public static void main(String args[])
      {
	System.out.println("Start Of Main");
	Thread mth1=new Thread(new Thread3());
	mth1.start();
	Thread mth2=new Thread(new Thread3());
	mth2.start();
	for(int i=1;i<=10;i++)
	  System.out.println("Main : "+i);
	System.out.println("End Of Main");
      }
  }