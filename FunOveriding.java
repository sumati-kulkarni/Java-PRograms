import java.io.*;

class b
  {
    void read()
      {
	System.out.println("BASE CLASS");
      }
  }

class d extends b
  {
    void read()
      {
	System.out.println("DERIVED CLASS");
      }
  }

class FunOveriding
  {
    public static void main(String args[])
      {
	System.out.println("------------------------------------------------");
	System.out.println("b x=new b()");
	b x=new b();
	x.read();
	
	System.out.println("------------------------------------------------");
	System.out.println("b y=new d()");
	b y=new d();
	y.read();

	System.out.println("------------------------------------------------");
	System.out.println("d x=new b()");
	System.out.println("NOT POSSIBLE : d x=new b()");
	System.out.println("NOT POSSIBLE : x.read()");

	System.out.println("------------------------------------------------");
	System.out.println("d z=new d()");
	d z=new d();
	z.read();
	System.out.println("------------------------------------------------");
      }
  }
