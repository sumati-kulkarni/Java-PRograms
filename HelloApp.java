import java.applet.*;
import java.awt.*;

public class HelloApp extends Applet
  {
    String msg;
    
    public void init()
      {
	msg="Hello World";
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }
  }