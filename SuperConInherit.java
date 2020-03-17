

import java.io.*;

class b
  {
    int b;
   
    b()
      {
	System.out.println("base class default constructor");
	b=0;
      }
    b(int i)
      {
	System.out.println("base class parameterized constructor");
	b=i;
      }
  }


class d extends b
  {
    int d;
    d()
      {
	super();
	System.out.println("derived class default constructor");
	d=0;
      }
    d(int i)
      {
	super();
	System.out.println("derived class 1st parameter constructor");
	d=i;
      }
    d(int t1,int t2)
      {
	super(t1);
	System.out.println("derived class 2nd parameter constructor");
	d=t2;
      }
  }


class SuperConInherit
  {
    public static void main(String args[])throws IOException
     {
	System.out.println("------------------------------------------------");
	System.out.println("b p=new b()");
	b p=new b();
	System.out.println("------------------------------------------------");
	System.out.println("b q=new b(5)");
	b q=new b(5);
	System.out.println("------------------------------------------------");
 	System.out.println("d r=new d()");
	d r=new d();
	System.out.println("------------------------------------------------");
	System.out.println("d s=new d(5)");
	d s=new d(5);
	System.out.println("------------------------------------------------");
	System.out.println("d t=new d(5,3)");
	d t=new d(5,3);
	System.out.println("------------------------------------------------");
     }
  }