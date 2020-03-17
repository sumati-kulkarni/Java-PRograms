import java.awt.*;
import java.applet.*;

class HelloFrame extends Frame
  {
    String msg;

    HelloFrame()
      {
	msg="Hello World";
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }
  }


public class HelloFrameApp extends Applet
  {
    public void init()
      {
	HelloFrame f=new HelloFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }