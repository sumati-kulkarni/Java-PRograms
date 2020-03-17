import java.io.*;
import java.awt.*;
import java.applet.*;

public class AppStringRotate extends Applet implements Runnable
  {
    Thread t;
    String msg;

    public void init()
      {
	msg="SNEHA";
      }

    public void start()
      {
	t=new Thread(this);
	t.start();
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }

    public void stop()
      {
	t.stop();
	t=null;
      }

    public void run()
      {
	while(true)
	  {
	    msg=msg.substring(1,5)+(""+msg.charAt(0));
	    repaint();
	    try
	      {
		Thread.sleep(500);
	      }catch(Exception e)
		 {
		   System.out.println("Error : "+e);
		  }
	  }
      }


  }