import java.io.*;

class DiaMatrix
  {
    public static void main(String args[])throws IOException
      {
        int m,n,a[][],i,j,sp,ss;
        DataInputStream cin=new DataInputStream(System.in);
        System.out.println("Enter the order of matrix");
        System.out.print("Enter Order Of row:");
        m=Integer.parseInt(cin.readLine());
        System.out.print("\nEnter the order of column:");
        n=Integer.parseInt(cin.readLine());
        if(m==n)
          {
            a=new int[m][n];
            System.out.println("\nEnter matrix elements of order "+m+"X"+n);
            for(i=0;i<m;i++)
              {
                for(j=0;j<n;j++)
                  a[i][j]=Integer.parseInt(cin.readLine());
              }
            sp=ss=0;
            for(i=0,j=m-1;i<m;i++,j--)
              {
                sp=sp+a[i][i];
                ss=ss+a[i][j];
              }
            System.out.println("Principal Diagonal Sum = "+sp);
            System.out.println("Secondary Diagonal Sum = "+sp);
          }
        else
          {
            System.out.println("Principal & Secondary Diagonal Sum Is Not Possible");
          }
      }
  }    