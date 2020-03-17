import java.io.*;
 
class CmdNatNum
  {
    public static void main(String args[])
      {
         int n,i;
         n=Integer.parseInt(args[0]);
         System.out.println(n+" Natural Numbers Are:");
         for(i=1;i<=n;i++)
         System.out.println(" "+i);
      }
  }