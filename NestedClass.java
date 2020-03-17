import java.io.*;

class Outer
  {
    String stro="Outer Data";
    void Outerdisp()
      {
        System.out.println("Outer Class : Outer Display : "+stro);
      }
    class Inner
      {
        String stri="Inner Data";
        void Innerdisp()
          {
            System.out.println("\nInner Class : Inner Display : "+stri);
            System.out.println("Inner Class : Inner Display : "+stro);
          }
      }
    void calling()
      {
        Inner i=new Inner();
        i.Innerdisp();
      }   
  }

class NestedClass
  {
    public static void main(String args[])throws IOException
      {
        Outer o=new Outer();
        o.Outerdisp();
        o.calling();
      }
  }
    