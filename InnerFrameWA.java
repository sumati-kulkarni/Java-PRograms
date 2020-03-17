import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
  {
    String msg;

	
	class FrameWA extends MouseAdapter
      {
        public void mouseClicked(MouseEvent me)
          {
	    msg="Mouse Clicked";
	    repaint();
          }
      }
	  
	  
    MyFrame()
      {
	msg="";
	addMouseListener(new FrameWA(this));
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }
  }



class MouseAdapter implements MouseListener
  {

    public void mouseEntered(MouseEvent me)
      {
      }

    public void mouseExited(MouseEvent me)
      {
      }

    public void mousePressed(MouseEvent me)
      {
      }

    public void mouseReleased(MouseEvent me)
      {
      }

    public void mouseClicked(MouseEvent me)
      {
      }

  }

class InnerFrameWA
  {
    public static void main(String args[])
      {
	MyFrame f=new MyFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }
