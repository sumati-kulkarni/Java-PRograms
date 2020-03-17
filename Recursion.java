import java.io.*;

class Recursion
  {
    public static void main(String args[])
      {
        disp(1);
      }
    static void disp(int i)
      {
        System.out.println(""+i);
        if(i<=4)
           disp(i+1);
      }
  }