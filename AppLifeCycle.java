import java.awt.*;
import java.applet.*;

public class AppLifeCycle extends Applet
  {
    public void init()
      {
	System.out.println("Applet Initialised");
      }

    public void start()
      {
	System.out.println("Applet Started");
	repaint();
      }

    public void paint(Graphics g)
      {
	System.out.println("Applet Painted");
      }

    public void stop()
      {
	System.out.println("Applet Stopped");
      }

    public void destroy()
      {
	System.out.println("Applet Destroyed");
      }
  }