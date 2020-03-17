import java.io.*;

class outer
  {
    String stro="Outer Data";
    void outerdisp()
      {
        System.out.println("Outer Class : Outer Display : "+stro);
        for(int i=0;i<5;i++)
          {
            System.out.println("\nDisplay "+(i+1));
            class inner
              {
                String stri="Inner Data";
                void innerdisp()
                  {
                    System.out.println("Inner Class : Inner Display : "+stri);
                    System.out.println("Inner Class : Inner Display : "+stro);
                  }
              }       
            inner in=new inner();
            in.innerdisp();
          }
      }  
  }

class ClassLoop

  {
    public static void main(String args[])throws IOException
      {
        outer o=new outer();
        o.outerdisp();
      }
  }
    