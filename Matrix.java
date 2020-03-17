import java.io.*;

class Matrix
  {
    public static void main(String args[])throws IOException
      {
        int m,n,a[][];
        DataInputStream cin=new DataInputStream(System.in);
        System.out.println("Enter the order of matrix");
        System.out.print("Enter Order Of row:");
        m=Integer.parseInt(cin.readLine());
        System.out.print("\nEnter the order of column:");
        n=Integer.parseInt(cin.readLine());
        a=new int[m][n];
        System.out.println("\nEnter matrix elements of order "+m+"X"+n);
        for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
              a[i][j]=Integer.parseInt(cin.readLine());
          }
        System.out.println("\nThe Matrix Elements Are : ");
        for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
              System.out.print(" "+a[i][j]);
            System.out.println("");
          }
      }
  }

  