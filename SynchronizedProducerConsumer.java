import java.io.*;

class Data
{
	int d;
	boolean valueReady;
	
	Data()
	{
		d=0;
		valueReady=false;
	}
	
	synchronized void putData(int t)
	{
		try{
			while(valueReady)
				wait();
			d=t;
			valueReady=true;
			System.out.println("Produced : "+d);
			notify();
		}catch(InterruptedException e)
		{
			System.out.println("Error : "+e);
		}
	}
	
	synchronized int getData()
	{
		int t=0;
		try{
			while(!valueReady)
				wait();
			t=d;
			System.out.println("Consumed : "+t);
			valueReady=false;
			notify();
		}catch(InterruptedException e)
		{
			System.out.println("Error : "+e);
		}
		return t;
	}
}

class Producer implements Runnable
{
	Data dt;
	
	Producer(Data t)
	{
		dt=t;
	}
	
    public void run()
	{
		System.out.println("Start Of Producer Thread");
		for(int i=10;i>=1;i--)
		{
			dt.putData(i);
		}
		System.out.println("End Of Producer Thread");
    }
}

class Consumer implements Runnable
{
	Data dt;
	
	Consumer(Data t)
	{
		dt=t;
	}
	
    public void run()
	{
		int t;
		System.out.println("Start Of Consumer Thread");
		for(int i=10;i>=1;i--)
		{
			t=dt.getData();
		}
		System.out.println("End Of Consumer Thread");
    }
}

class SynchronizedProducerConsumer
{
	public static void main(String args[])
	{
		Data d=new Data();
		Thread t1=new Thread(new Producer(d));
		Thread t2=new Thread(new Consumer(d));
		t1.start();
		t2.start();
	}
}