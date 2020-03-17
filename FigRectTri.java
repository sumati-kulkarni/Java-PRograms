import java.io.*;

class figure
  {
    int d1,d2;
    void read()throws IOException
      {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter Dimension1 : ");
        d1=Integer.parseInt(din.readLine());
        System.out.print("Enter Dimension2 : ");
        d2=Integer.parseInt(din.readLine());
      }
    void disp()
      {
        System.out.print("Dimension 1 : "+d1+"\nDimension 2 : "+d2);
      }
    void area()
      {
      }
  }

class rect extends figure
  {
    int a;
    void area()
      {
 	a=0;
	a=d1*d2;
	System.out.println("\nAREA OF RECTANGLE: "+a);
      }
  }


class tri extends figure
  {
    float a;
    void area()
      {
 	a=0;
	a=(0.5f)*(float)(d1*d2);
	System.out.println("\nAREA OF TRIANGLE: "+a);
      }
  }

class FigRectTri
  {
    public static void main(String args[])throws IOException
      {
 	DataInputStream din=new DataInputStream(System.in);
	int ch,i,n;
        System.out.print("Enter The Value Of n : ");
        n=Integer.parseInt(din.readLine());
	figure x[]=new figure[n];
	for(i=0;i<x.length;i++)
	  {
	    System.out.print("\n1->Rectangle\n2->Triangle\nEnter your choice : ");
	    ch=Integer.parseInt(din.readLine());
	    if(ch==1)
	      {
		x[i]=new rect();
		System.out.println("\nRectangle");
	      }
	    else
	      {
		x[i]=new tri();
		System.out.println("\nTriangle");
	      }
	    x[i].read();
	  }
	System.out.println("\nTitle\tPrice\tDescription\n");
	for(i=0;i<x.length;i++)
          {
            x[i].disp();
	    x[i].area();
          }
      }
  }