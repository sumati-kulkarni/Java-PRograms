import java.io.*;

class FunSum
  {
    public static void main(String args[])
      {
        FunSum x=new FunSum();
        int a,b,c;
        a=10;
        b=20;
        c=x.add(a,b);
        System.out.println("Sum = "+a+" + "+b+" = "+c);
      }
    int add(int x,int y)
      {
        return (x+y);
      }
  }