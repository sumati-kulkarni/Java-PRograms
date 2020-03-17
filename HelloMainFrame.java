import java.awt.*;

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

class HelloMainFrame
  {
    public static void main(String args[])
      {
	HelloFrame f=new HelloFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }

