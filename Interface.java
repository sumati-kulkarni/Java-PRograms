import java.io.*;

interface iemp
  {
    void read();
    void disp();
  }

class cemp implements iemp
  {
    int eno;
    String na;
    
    public void read()
      {
        DataInputStream din=new DataInputStream(System.in);
	try
	  {
	    System.out.print("Enter Employee Number : ");
	    eno=Integer.parseInt(din.readLine());
	    System.out.print("\nEnter Employee Name : ");
	    na=din.readLine();
	  }catch(Exception e)
	    {
	    }
      }
    public void disp()
      {
	System.out.println("\nEmployee Number : "+eno+"\nEmployee Name : "+na);
      }
  }

class Interface
  {
    public static void main(String args[])throws IOException
      {
	iemp x;
	x=new cemp();
	x.read();
	x.disp();
      }
  }