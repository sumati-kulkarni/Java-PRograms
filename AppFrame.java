import java.awt.*;
import java.applet.*;

class MyFrame extends Frame
{
	String msg;
	
	MyFrame()
	{
		msg="Hello World";
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, 100, 100);
	}
}

public class AppFrame extends Applet
{
	public void start()
	{
		MyFrame f = new MyFrame();
		f.setSize(100,100);
		f.setVisible(true);
	}
}