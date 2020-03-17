import java.io.*;

class Circle
  {
    int r;
    float a;
    static float pi;
    Circle()
      {
        r=0;
        a=0f;
      }
    static void assign()
      {
        pi=3.142f;
      }
    void read()throws IOException
      {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter The value Of Radius : ");
        r=Integer.parseInt(din.readLine());
        a=(float)(r*r)*pi;
      }
    void disp()
      {
        System.out.println("Area Of Circle : "+a);
      }
  }

class StaticMemCircle
  {
    public static void main(String args[])
      {
       try
       {
        Circle x=new Circle();
        Circle.assign();
        x.read();
        x.disp();
    
        Circle y=new Circle();
        Circle.assign();
        y.read();
        y.disp();
       }catch(Exception e)
          {
            System.out.println("Error: "+e);
          }
     }
  }