import java.io.*;

class CmdLine
  {
    public static void main(String args[])
      {
         int a,b,c;
         if(args.length!=2)
           {
              System.out.println("Invalid Number Of Arguments");
              System.exit(0);
           }
         a=Integer.parseInt(args[0]);
         b=Integer.parseInt(args[1]);
         c=a+b;
         System.out.println("Sum = "+a+" + "+b+" = "+c);
      }
  }