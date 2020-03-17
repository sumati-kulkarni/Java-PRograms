import java.io.*;
import java.net.*;

class UDPClient
  {
    public static void main(String args[])
      {
        DatagramSocket ds;
	DatagramPacket dp;
	byte b[];
	String str;
	InetAddress inet;
	try
	  {
	    ds=new DatagramSocket();
	    b=new byte[1];
	    inet=InetAddress.getByName("localhost");
		dp=new DatagramPacket(b,b.length,inet,8080);
	    ds.send(dp);
	    b=new byte[256];
	    dp=new DatagramPacket(b,b.length);
	    ds.receive(dp);
	    str=new String(dp.getData());
	    System.out.println("Message From UDP Server : "+str);

	  }catch(Exception e)
	     {
		System.out.println("Error : "+e);
	     }
      }
  }