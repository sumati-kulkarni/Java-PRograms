//           Server Program USing FTP Protocol

import java.io.*;
import java.net.*;

class FTPServer
  {
    public static void main(String args[])
      {
         int ch,count=0;
         ServerSocket ss=null;
         Socket s=null;
         FileInputStream fin=null;
         DataOutputStream dout=null;
		 DataInputStream din=null, fdin=null;
		 String str, fname, data;
         try
           {
             ss=new ServerSocket(7575);
             for(;;)
               {
				 count++;                                                   
                 System.out.println(".............Waiting For Client Request "+count);
                 s=ss.accept();
				 System.out.println("Recieved Request From Client"+count);
				 din = new DataInputStream(s.getInputStream());
                 dout = new DataOutputStream(s.getOutputStream());
				 fname = din.readLine();
				 System.out.println("name : "+fname);
                 try
				 {
					fin=new FileInputStream(fname);
				 }catch(Exception e)
				 {
					System.out.println("Error : "+e);
					dout.writeBytes("NOT FOUND");
					din.close();
					s.close();
					continue;
				 }
				 dout.writeBytes("FOUND");
				 str = din.readLine();
				 if(str.equals("SEND"))
				 {
					fdin = new DataInputStream(fin);
					while((str=fdin.readLine()).length()!=0)
						dout.writeBytes(str);
					dout.writeBytes("EOF");
					fdin.close();
				 }
				 din.close();
				 dout.close();
				 s.close();
               }
           }catch(Exception e)
             {
		System.out.println("Error : "+e);
             }
      }
  }