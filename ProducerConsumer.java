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
	
	void putData(int t)
	{
		while(valueReady);
		d=t;
		System.out.println("Produced : "+d);
		valueReady=true;
	}
	
	int getData()
	{
		int t=0;
		while(!valueReady)
			t=d;
		System.out.println("Consumed : "+t);
		valueReady=false;
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

class ProducerConsumer
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