//What Web Server Writes


import java.io.*;
import java.net.*;

class WebServer
  {
    public static void main(String args[])
      {
         ServerSocket ss=null;
         Socket s=null;
         DataInputStream din=null;
         try
           {
             ss=new ServerSocket(8080);
             for(;;)
               {
                 s=ss.accept();
                 din=new DataInputStream(s.getInputStream());
                 System.out.println(".......Data Recieved From Browser is");
                 for(int i=1;i<=8;i++)
                   {
                     System.out.println("Browser Line "+i+" "+din.readLine());
                   }
                 din.close();
                 s.close();
               }
           }catch(Exception e)
             {
		System.out.println("Error : "+e);
             }
      }
  }