import java.io.*;

class Data
{
	int d;
	Data()
	{
		d=1;
	}
}

class MyThread implements Runnable
{
	String str;
	Data dt;
	MyThread(String msg, Data t)
	{
		str=msg;
		dt=t;
	}
    public void run()
    {
		System.out.println("Start Of "+str+" Thread");
		for(int i=dt.d;dt.d<=10;dt.d++)
			System.out.println(str+dt.d);
		System.out.println("End Of "+str+" Thread");
    }
}

class DataThread
{
    public static void main(String args[])
    {
		System.out.println("Start Of Main");
		Data d1=new Data();
		Data d2=new Data();
		MyThread mth1=new MyThread("First", d1);
		MyThread mth2=new MyThread("Second", d2);
		Thread t1=new Thread(mth1);
		Thread t2=new Thread(mth2);
		t1.start();
		t2.start();
		System.out.println("End Of Main");
    }
}