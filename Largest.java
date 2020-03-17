import java.io.*;

class Largest
  {
    public static void main(String args[])throws IOException
      {
        int a[],N,l,i;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.println("Enter Array Size : ");
        N=Integer.parseInt(cin.readLine());
        a=new int[N];
        System.out.println("Enter "+N+" Integer Values");
        for(i=0;i<a.length;i++)
            a[i]=Integer.parseInt(cin.readLine());
        l=a[0];
        for(i=1;i<a.length;i++)
          {
            if(a[i]>l)
              l=a[i];
          }
        System.out.println("Largest = "+l);
      }
  }
