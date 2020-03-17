import java.io.*;

class media
  {
    String na;
    float price;
    void read()throws IOException
      {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter Title : ");
        na=din.readLine();
        System.out.print("Enter Price : ");
        price=Float.parseFloat(din.readLine());
      }
    void disp()
      {
        System.out.print(na+"\t"+price);
      }
  }

class book extends media
  {
    int nop;
    void read()throws IOException
      {
	DataInputStream din=new DataInputStream(System.in);
        super.read();
	System.out.print("Enter Number Of Pages In The Book : ");
        nop=Integer.parseInt(din.readLine());
      }
    void disp()
      {
 	super.disp();
	System.out.println("\t"+nop);
      }
  }

class tape extends media
  {
    int dur;
    void read()throws IOException
      {
	DataInputStream din=new DataInputStream(System.in);
        super.read();
	System.out.print("Enter Duration Of Tape : ");
        dur=Integer.parseInt(din.readLine());
      }
    void disp()
      {
 	super.disp();
	System.out.println("\t"+dur);
      }
  }

class HierarInherit
  {
    public static void main(String args[])throws IOException
      {
 	DataInputStream din=new DataInputStream(System.in);
	int i,n;
        System.out.print("Enter The Value Of n : ");
        n=Integer.parseInt(din.readLine());
	book x[]=new book[n];
	for(i=0;i<x.length;i++)
	  {
	    System.out.println("\nBook"+(i+1));
	    x[i]=new book();
	    x[i].read();
	  }
	tape y[]=new tape[n];
	for(i=0;i<y.length;i++)
 	  {
	    System.out.println("\nTape"+(i+1));
	    y[i]=new tape();
	    y[i].read();
	  }
	System.out.println("\nS.No\tTitle\tPrice\tNo Of Pages\n");
	for(i=0;i<x.length;i++)
          {
	    System.out.print((i+1)+"\t");
            x[i].disp();
          }
	System.out.println("\nS.No\tTitle\tPrice\tDuration\n");
	for(i=0;i<y.length;i++)
	  {
	    System.out.print((i+1)+"\t");
	    y[i].disp();
          }
      }
  }