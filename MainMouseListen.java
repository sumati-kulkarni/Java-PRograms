import java.awt.*;
import java.awt.event.*;

class FrameMouseListen extends Frame implements MouseListener
  {
    String msg;

    FrameMouseListen()
      {
	msg="";
	addMouseListener(this);
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }

    public void mouseEntered(MouseEvent me)
      {
	msg="Entered";
	repaint();
      }

    public void mouseExited(MouseEvent me)
      {
	msg="Exited";
	repaint();
      }

    public void mousePressed(MouseEvent me)
      {
	msg="Pressed";
	repaint();
      }

    public void mouseReleased(MouseEvent me)
      {
	msg="Released";
	repaint();
      }

    public void mouseClicked(MouseEvent me)
      {
      }

  }


class MainMouseListen
  {
    public static void main(String args[])
      {
	FrameMouseListen f=new FrameMouseListen();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }
