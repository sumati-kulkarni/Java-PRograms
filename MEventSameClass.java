import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MEventSameClass extends Frame implements MouseListener,MouseMotionListener
{
    String msg;
    int mousex,mousey;
    MEventSameClass()
    {
		addMouseListener(this);
		addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="Mouse Clicked "+mousex+","+mousey;
		repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseRealeased "+mousex+","+mousey;
		repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseEntered "+mousex+","+mousey;
		repaint();
    }
    public void mouseExited(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseExited "+mousex+","+mousey;
		repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="MouseDragged";
		msg="Dragging mouse at "+mousex+","+mousey;
		repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
		mousex=me.getX();
		mousey=me.getY();
		msg="Moving mouse at "+mousex+","+mousey;
		repaint();
    }
    public void mousePressed(MouseEvent me)
    {
    }
    public void paint(Graphics g)
    {
		g.drawString(msg,mousex,mousey);
    }
	public static void main(String args[])
	{
		MEventSameClass f = new MEventSameClass();
		f.setSize(100, 100);
		f.setVisible(true);
	}
}