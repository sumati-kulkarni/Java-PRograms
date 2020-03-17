import java.io.*;

class StaticVar
  {
    static int i=5;
    public static void main(String args[])
      {
         Disp();
         Disp();
         Disp();
      }
    static void Disp()
      {
         i=i+3;
         System.out.println(i);
         
      }
  }