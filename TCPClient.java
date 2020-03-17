//           Client Program USing TCP Protocol

import java.io.*;
import java.net.*;

class TCPClient
  {
    public static void main(String args[])
      {
         Socket s=null;
         InputStream in=null;
         DataInputStream din=null;
         String msg;
         try
           {
             s=new Socket("localhost",8080);
             in=s.getInputStream();
             din=new DataInputStream(in);
             msg=din.readLine();
             System.out.println("Message : "+msg);
             din.close();
             in.close();
             s.close();  
           }catch(Exception e)
             {
		System.out.println("Error : "+e);
             }
      }
  }