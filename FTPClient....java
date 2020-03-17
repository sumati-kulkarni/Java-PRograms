//           Server Program USing FTP Protocol

import java.io.*;
import java.net.*;

class FTPClient
  {
    public static void main(String args[]) throws IOException
      {
         Socket s=null;
         FileOutputStream fout=null;
         DataOutputStream dout=null;
         DataInputStream din1, din=new DataInputStream(System.in);
		 String str, data, fname;
		 
		 System.out.println("Enter a file name : ");
		 fname = din.readLine();
         try
           {
             s=new Socket("localhost",7575);
             din1=new DataInputStream(s.getInputStream());
             dout=new DataOutputStream(s.getOutputStream());
			 dout.writeBytes(fname);
			 str = din1.readLine();
			 System.out.println("Message : "+str);
			 if(str.equals("FOUND"))
			 {
				fout=new FileOutputStream(fname);
				dout.writeBytes("SEND");
				while((data=din1.readLine()).equals("EOF"))
					fout.write(data.getBytes());
				fout.close();
			 }
			 else
			 {
				System.out.println("FILE NOT FOUND");
				din1.close();
				dout.close();
				s.close();  
			 }
           }catch(Exception e)
             {
				System.out.println("Error : "+e);
             }
      }
  }