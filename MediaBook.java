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

class MediaBook
  {
    public static void main(String args[])throws IOException
      {
 	DataInputStream din=new DataInputStream(System.in);
	int ch,i,n;
        System.out.print("Enter The Value Of n : ");
        n=Integer.parseInt(din.readLine());
	media x[]=new media[n];
	for(i=0;i<x.length;i++)
	  {
	    System.out.print("\n1->Book\n2->Tape\nEnter your choice : ");
	    ch=Integer.parseInt(din.readLine());
	    if(ch==1)
	      {
		x[i]=new book();
		System.out.println("\nBOOK");
	      }
	    else
	      {
		x[i]=new tape();
		System.out.println("\nTAPE");
	      }
	    x[i].read();
	  }
	System.out.println("\nTitle\tPrice\tDescription\n");
	for(i=0;i<x.length;i++)
          {
            x[i].disp();
          }
      }
  }