import java.io.*;

class BubbleSort
  {
    public static void main(String args[])throws IOException
      {
        int a[],n;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.print("Enter the value of n : ");
        n=Integer.parseInt(cin.readLine());
        a=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<a.length;i++)
          a[i]=Integer.parseInt(cin.readLine());
        for(int i=0;i<a.length-1;i++)
          {
            for(int j=i+1;j<a.length;j++)
              {
                if(a[i]>a[j])
                  {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                  }
              }
          }
        System.out.println("Sorted Array Is");
        for(int i=0;i<a.length;i++)
          System.out.println(""+a[i]);
      }
  }
   
         
        