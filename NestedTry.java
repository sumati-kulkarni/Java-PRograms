import java.io.*;

class TestNestedTry
  {
    public static void main(String args[])
      {
	DataInputStream din=new DataInputStream(System.in);
	int i=0;
	try
	  {
	    System.out.println("Beginning Of Outer Try Statements");
	    try
	      {
		System.out.println("Beginning Of Inner Try Statements");
		i=Integer.parseInt(din.readLine());
		System.out.println("End Of Inner Try Statements");
	      }catch(IOException e)
		 {
		   System.out.println("Error : "+e);
		 }
	    System.out.println("End Of Outer Try Statements");
	  }catch(NumberFormatException e)
	     {
		System.out.println("Error : "+e);	
	     }
      }
  }