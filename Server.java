//To Transfer A File From One System To Another

import java.io.*;
import java.net.*;

class Server
  {
    public static void main(String args[])
      {
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress inet;
	byte b[];
	int portno;
	String fname;
	FileInputStream fin;
	File file;
	try
	  {
	    ds=new DatagramSocket(8080);
	    while(true)
	      {
		b=new byte[20];
		dp=new DatagramPacket(b,b.length);
		ds.receive(dp);
		inet=dp.getAddress();
		portno=dp.getPort();
		fname=new String(dp.getData());
		file=new File(fname);
		if(!file.exists())
		  {
		    b="NF".getBytes();
		    dp=new DatagramPacket(b,b.length,inet,portno);
		    ds.send(dp);
		  }
		else
		  {
		    b="F".getBytes();
		    dp=new DatagramPacket(b,b.length,inet,portno);
		    ds.send(dp);
		    fin=new FileInputStream(file);
		    b=new byte[256];
		    while(fin.read(b)>-1)
		      {
			dp=new DatagramPacket(b,b.length,inet,portno);
			ds.send(dp);
		      }
		    b="EXIT".getBytes();
		    dp=new DatagramPacket(b,b.length,inet,portno);
		    ds.send(dp);
		    fin.close();
		  }
	      }
	  }catch(Exception e)
	     {
		System.out.println("Error : "+e);
	     }
      }
  }