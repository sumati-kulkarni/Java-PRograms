import java.io.*;

class ChainException
{
	static int a,b;
	
	static void test()
	{
		try
		{
			DataInputStream din=new DataInputStream(System.in);
			a=Integer.parseInt(din.readLine());
		}catch(IOException e)
		{
			a=0;
		}
		
		try	
		{
			DataInputStream din=new DataInputStream(System.in);
			b=Integer.parseInt(din.readLine());
		}catch(IOException e)
		{
			b=0;
		}
		
		try
		{
			int c=a/b;
		}catch(ArithmeticException e)
		{
			e.initCause(new IOException("Divide By Zero"));
			throw e;
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			test();
		}catch(ArithmeticException e)
		{
			System.out.println("Actual Exception "+e);
			System.out.println("Chained Exception "+e.getCause());
		}
	}
}
	
	
	 