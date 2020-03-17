import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MEvent extends Applet implements MouseListener,MouseMotionListener
{
    String msg;
    int mousex,mousey;
    public void init()
    {
		addMouseListener(this);
		addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="Mouse Clicked";
		repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseRealeased";
		repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseEntered";
		repaint();
    }
    public void mouseExited(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseExited";
		repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseDragged";
		showStatus("Dragging mouse at "+mousex+","+mousey);
		repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		showStatus("Moving mouse at "+mousex+","+mousey);
    }
    public void mousePressed(MouseEvent me)
    {
    }
    public void paint(Graphics g)
    {
		g.drawString(msg,mousex,mousey);
    }
}