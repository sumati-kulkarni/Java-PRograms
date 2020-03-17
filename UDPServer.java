import java.io.*;
import java.net.*;

class UDPServer
  {
    public static void main(String args[])
      {
        DatagramSocket ds;
	DatagramPacket dp;
	byte b[];
	int portno;
	int c=1;
	String str;
	InetAddress inet;
	try
	  {
	    ds=new DatagramSocket(8080);
	    while(true)
	      {
		System.out.println("Waiting for client "+(c++));
		b=new byte[1];
		dp=new DatagramPacket(b,b.length);
		ds.receive(dp);
		str="Hello World From UDP Server";
		b=str.getBytes();
		inet=dp.getAddress();
		portno=dp.getPort();
		dp=new DatagramPacket(b,b.length,inet,portno);
		ds.send(dp);
	      }
	  }catch(Exception e)
	     {
		System.out.println("Error : "+e);
	     }
      }
  }