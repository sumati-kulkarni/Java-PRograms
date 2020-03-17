//           Server Program USing TCP Protocol

import java.io.*;
import java.net.*;

class TCPServer
  {
    public static void main(String args[])
      {
         int count=0;
         ServerSocket ss=null;
         Socket s=null;
         OutputStream out=null;
         DataOutputStream dout=null;
         try
           {
             ss=new ServerSocket(8080);
             for(;;)
               {
                 count++;
                 System.out.println("Waiting For Client Request "+count);
                 s=ss.accept();
                 System.out.println("Recieved Request From Client"+count);
                 out=s.getOutputStream();
		 dout=new DataOutputStream(out);
                 dout.writeBytes("TCP Client\n\nHELLO WORLD to TCP Client "+count);
                 dout.close();
                 out.close();
                 s.close();
                 System.out.println(".......Client"+count+" Request Served & Closed");
               }
           }catch(Exception e)
             {
		System.out.println("Error : "+e);
             }
      }
  }
    