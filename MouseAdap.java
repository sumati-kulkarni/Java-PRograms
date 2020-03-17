import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
  {
    String msg;

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

class FrameWA extends MouseAdapter
  {
    MyFrame f;

    FrameWA(MyFrame t)
      {
	f=t;
      }

    public void mouseClicked(MouseEvent me)
      {
	f.msg="Mouse Clicked";
	f.repaint();
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

class MouseAdap
  {
    public static void main(String args[])
      {
	MyFrame f=new MyFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }
