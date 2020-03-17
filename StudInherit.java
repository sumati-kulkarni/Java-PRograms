import java.io.*;

class student
  {
    int rno;
    String na;
    void read()throws IOException
      {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter Roll Number : ");
        rno=Integer.parseInt(din.readLine());
        System.out.print("Enter Name : ");
        na=din.readLine();
      }
    void disp()
      {
        System.out.println("Roll Number : "+rno+"\nName : "+na);
      }
  }

class marks extends student
  {
    int m1,m2,total;
    void read()throws IOException
      {
        super.read();
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter Marks1 : ");
        m1=Integer.parseInt(din.readLine());
        System.out.print("Enter Marks2 : ");
        m2=Integer.parseInt(din.readLine());
        total=m1+m2;
      }
    void disp()
      {
        super.disp();
        System.out.println("Marks1 : "+m1);
        System.out.println("Marks2 : "+m2);
	System.out.println("Total : "+total);
      }
  }

class StudInherit
  {
    public static void main(String args[])throws IOException
      {
        marks x=new marks();
        x.read();
	x.disp();
      }
  }