import java.io.*;

class StaticNatNum
  {
    static int i=1;
    public static void main(String args[])
      {
          Disp();
      }
    static void Disp()
      {
         
         System.out.println(i);
         if(i<=9)
           {
             i++;
             Disp();
           }
      }
  }