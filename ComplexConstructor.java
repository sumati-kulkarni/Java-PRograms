import java.io.*;

class Complex
  {
    int r,i;
    Complex()
      {
        r=i=0;
      }
    Complex(int tr,int ti)
      {
        r=tr;
        i=ti;
      }
    Complex(Complex t)
      {
        r=t.r;
        i=t.i;
      }
    void read()throws IOException
      {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter real part: ");
        r=Integer.parseInt(din.readLine());
        System.out.print("Enter Imaginary part: ");
        i=Integer.parseInt(din.readLine());
      }
    void disp()
      {
        System.out.println("Complex Number = "+r+"+i"+i);
      }
    Complex add(Complex t2)
      {
        Complex t=new Complex();
        t.r=r+t2.r;
        t.i=i+t2.i;
        return t;
      }
    void add(Complex t1,Complex t2)
      {
        r=t1.r+t2.r;
        i=t1.i+t2.i;
      }
    protected void finalise()
      {
      }
  } 

class ComplexConstructor
  {
    public static void main(String args[])throws IOException
      {
        Complex x=new Complex();
        System.out.println("\nDefault Constructor");
        System.out.println("Complex x=new Complex()");
        x.disp();
        System.out.println("\nParameterised Constructor");
        System.out.println("Complex y=new Complex(5,3)");  
        Complex y=new Complex(5,3);
        y.disp();
        System.out.println("\nCopy Constructor");
        System.out.println("Complex z=new Complex(y)");
        Complex z=new Complex(y);
        y.disp();
        z.disp();
        System.out.println("\nAddition Of Two Complex Numbers Passing Single Parameter");
        System.out.println("c=a.add(b)");
        Complex a=new Complex();
        Complex b=new Complex();
        System.out.println("Enter First Complex Number:");
        a.read();
        System.out.println("Enter Second Complex Number:");
        b.read();
        System.out.println("After Addition");
        Complex c=new Complex();
        c=a.add(b);
        c.disp();
        System.out.println("\nAddition Of Two Complex Numbers Passing Multiple Parameter");
        System.out.println("d.add(a,b)");
        Complex d=new Complex();
        d.add(a,b);
        d.disp();
      }
  }
        