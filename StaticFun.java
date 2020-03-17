import java.io.*;


class StaticFun
  {
    public static void main(String args[])
      {
         Integer a=new Integer(10);
         Integer b=new Integer(20);
         Integer c;
         c=add(a,b);
         System.out.println("Sum = "+a.intValue()+" + "+b.intValue()+" = "+c.intValue());
      }
    static Integer add(Integer x,Integer y)
      {
        return (new Integer(x.intValue()+y.intValue()));
      }
  }