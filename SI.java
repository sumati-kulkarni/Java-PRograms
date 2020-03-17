import java.io.*;

class SI
  {
    public static void main(String args[])throws IOException
      {
        int p,t;
        float r,interest;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.print("Enter Principle Amount :");
        p=Integer.parseInt(cin.readLine());
        System.out.print("\nEnter Time Taken :");
        t=Integer.parseInt(cin.readLine());
        System.out.print("\nEnter Rate :");
        r=Float.parseFloat(cin.readLine());
        interest=(p*t*r)/100;
        System.out.println("Simple Interest = "+interest);
      }
  }
