import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
  {
    String msg;

    MyFrame()
      {
	msg="";
	addMouseListener(new FrameWinAdap(this));
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }
  }

class FrameWinAdap implements MouseListener
  {
    MyFrame f;

    FrameWinAdap(MyFrame t)
      {
	f=t;
      }

    public void mouseEntered(MouseEvent me)
      {
	f.msg="Entered";
	f.repaint();
      }

    public void mouseExited(MouseEvent me)
      {
	f.msg="Exited";
	f.repaint();
      }

    public void mousePressed(MouseEvent me)
      {
	f.msg="Pressed";
	f.repaint();
      }

    public void mouseReleased(MouseEvent me)
      {
	f.msg="Released";
	f.repaint();
      }

    public void mouseClicked(MouseEvent me)
      {
      }

  }


class MainWinAdap
  {
    public static void main(String args[])
      {
	MyFrame f=new MyFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }
