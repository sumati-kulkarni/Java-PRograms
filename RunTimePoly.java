import java.io.*;

class b
  {
    void readB()
      {
	System.out.println("BASE CLASS : readB()");
      }
  }

class d extends b
  {
    void readD()
      {
	System.out.println("DERIVED CLASS : readD()");
      }
  }

class RunTimePoly
  {
    public static void main(String args[])
      {
	System.out.println("------------------------------------------------");
	System.out.println("b x=new b()");
	b x=new b();
	x.readB();
	System.out.println("NOT POSSIBLE : x.readD()");

	System.out.println("------------------------------------------------");
	System.out.println("b y=new d()");
	b y=new d();
	y.readB();
	System.out.println("NOT POSSIBLE : y.readD()");

	System.out.println("------------------------------------------------");
	System.out.println("d x=new b()");
	System.out.println("NOT POSSIBLE : d x=new b()");
	System.out.println("NOT POSSIBLE : x.readB()");
	System.out.println("NOT POSSIBLE : x.readD()");

	System.out.println("------------------------------------------------");
	System.out.println("d z=new d()");
	d z=new d();
	z.readB();
	z.readD();
	System.out.println("------------------------------------------------");
      }
  }
