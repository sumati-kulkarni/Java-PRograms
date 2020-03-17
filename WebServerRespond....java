import java.io.*;
import java.net.*;

class WebServerRequest
  {
    ServerSocket ss;
	WebServerRequest()
	{
         try
		 {
			ss=new ServerSocket(8080);
		 }catch(Exception e)
		 {
		 }
	}	
    public static void main(String args[])
      {
		 WebServerRequest ws=new WebServerRequest();
         ws.go();
      }
    void go()
      {
         Socket s=null;
         for(;;)
           {
            try
			{
			s=ss.accept();
            Thread t1=new Thread(new ServerRespond(s));
            t1.start();
			}catch(Exception e)
			{
			}
           }
      }
  }


class ServerRespond implements Runnable
  {
    Socket s;
    ServerRespond(Socket ts)
      {
        s=ts;
      }
    public void run()
      {
        DataInputStream din=null;
        DataOutputStream dout=null;
        String request;
        File file;
        try
          {
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            request=parseRequest(din);
            file=new File(request);
            if(file.exists())
              respondHTTP(request,dout,true);
            else
              respondHTTP("File Not Found",dout,false);
            din.close();
            dout.close();
            s.close();
          }catch(Exception e)
             {
             }
      }
    String parseRequest(DataInputStream din) throws IOException
      {
        int i;
        String str;
        str=din.readLine();
        i=str.indexOf(' ');
        str=str.subString(i+1,str.indexOf(' ',i+1));
        str="F:\\JPROG\\class JPROG"+str;
        return str;
      }
  } 