import java.io.*;

class AreaCircle
  {
    public static void main(String args[])throws IOException
      {
        final double pi=3.142;
        int r;
        float a=0;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.print("Enter the radius : ");
        r=Integer.parseInt(cin.readLine());
        a=(float)(pi*r*r);
        System.out.println("Area Of Circle : "+a);
      }
  }
