import java.io.*;

class CmdSumN
  {
    public static void main(String args[])
      {
         int i,sum,n;
         sum=0;
         for(i=0;i<args.length;i++)
           {
              n=Integer.parseInt(args[i]);
              sum=sum+n;
           }
         System.out.println("Sum = "+sum);
      }
  }