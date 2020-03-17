import java.io.*;

class Sum
  {
    public static void main(String args[])throws IOException
      {
        int i,j;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.print("Enter First Number : ");
        i=Integer.parseInt(cin.readLine());
        System.out.print("\nEnter Second Number : ");
        j=Integer.parseInt(cin.readLine());
        System.out.println("Sum = "+i+"+"+j+" = "+(i+j));
      }
  }
