import java.io.*;

class DivideException1
  {
    public static void main(String args[])
      {
	DataInputStream din=new DataInputStream(System.in);
	float a,b,c;
	System.out.print("\nEnter First Number : ");
	try
	  {
	    a=Float.parseFloat(din.readLine());
	  }catch(IOException e)
	     {
		System.out.println("\nIO Error While Reading First Data");
		a=0;
	     }
	   catch(NumberFormatException e)
	     {
		System.out.println("\nInvalid First Data");
		a=0;
	     }
	System.out.print("\nEnter Second Number : ");
	try
	  {
	    b=Float.parseFloat(din.readLine());
	  }catch(IOException e)
	     {
		System.out.println("\nIO Error While Reading Second Data");
		b=0;
	     }
	   catch(NumberFormatException e)
	     {
		System.out.println("\nInvalid Second Data");
		b=0;
	     }
	try
	  {
	    c=a/b;
	  }catch(ArithmeticException e)
	     {
		System.out.println("\nDivide By Zero Error");
		c=0;
	     }
	
	System.out.println("\nResult : "+c);
      }
  }