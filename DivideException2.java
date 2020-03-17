import java.io.*;

class DivideException2
  {
    public static void main(String args[])
      {
	DataInputStream din=new DataInputStream(System.in);
	float a,b,c;
	
	try
	  { 
	    System.out.print("\nEnter First Number : ");
	    a=Float.parseFloat(din.readLine());
	    System.out.print("\nEnter Second Number : ");
	    b=Float.parseFloat(din.readLine());
	    c=a/b;
	  }catch(IOException e)
	     {
		System.out.println("\nIO Error");
		a=b=c=0;
	     }
	   catch(NumberFormatException e)
	     {
		System.out.println("\nInvalid Data");
		a=b=c=0;
	     }
	   catch(ArithmeticException e)
	     {
		System.out.println("\nDivide By Zero Error");
		c=0;
	     }
	
	System.out.println("\nResult : "+c);
      }
  }