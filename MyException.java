import java.io.*;

class DataException extends Exception
  {
    String msg;
    DataException(String tmsg)
      {
	msg=tmsg;
      }
    public String toString()
      {
	return("DataException : "+msg);
      }
  }

class Data
  {
    static int readInt()throws DataException
      {
	DataInputStream din=new DataInputStream(System.in);
	int x;
	try
	  {
	    x=Integer.parseInt(din.readLine());
	  }catch(IOException e)
	     {
		throw new DataException("IO Error");
	     }
	   catch(NumberFormatException e)
	     {
		throw new DataException("Invalid Data");
	     }
	return x;
      }

    static float readFloat()throws DataException
      {
	DataInputStream din=new DataInputStream(System.in);
	float x;
	try
	  {
	    x=Float.parseFloat(din.readLine());
	  }catch(IOException e)
	     {
		throw new DataException("IO Error");
	     }
	   catch(NumberFormatException e)
	     {
		throw new DataException("Invalid Data");
	     }
	return x;
      }
  }


class MyException
  {
    public static void main(String args[])
      {
	int a;
	float b,c;
	try
	  {
	    a=Data.readInt();
	    b=Data.readFloat();
	    c=a+b;
	    System.out.println("Sum : "+c);
	  }catch(DataException e)
	     {
		System.out.println("Error : "+e);
	     }
      }
  }