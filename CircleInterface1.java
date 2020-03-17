import java.io.*;

interface iCircle
  {
    void read();
    void disp();
    void area();
  }

class Circle implements iCircle
  {
    int r;
    float a;
    
    public void read()
      {
	try
	{
	DataInputStream din=new DataInputStream(System.in);
	System.out.println("Enter Radius Of Circle : ");
	r=Integer.parseInt(din.readLine());
	}catch(Exception e)
	{
	}
      }

    public void area()
      {
	a=3.142f*r*r;
      }

    public void disp()   
      {
	System.out.println("Area : "+a);
      }
  }

class CircleInterface1
  {
    public static void main(String args[])
	{
	iCircle x[]=new iCircle[2];
    for(int i=0;i<2;i++)
      {
	x[i]=new Circle();
	x[i].read();
	x[i].area();
	x[i].disp();
      }
	  }
  }