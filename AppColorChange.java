import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;

public class AppColorChange extends Applet implements Runnable
{
	Thread t;
	Color c;
	Random x;
	
	public void init()
	{
		this.setBackground(new Color(255,255,255));
		x=new Random();
	}
	
	public void start()
	{
		t = new Thread(this);
		t.start();
	}
	
	public void paint(Graphics g)
	{
		this.setBackground(c);
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
			c = new Color(x.nextInt(255),x.nextInt(255),x.nextInt(255));
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