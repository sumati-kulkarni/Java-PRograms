import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MEventDiffClass extends Frame
{
    String msg;
    int mousex,mousey;
    MEventDiffClass()
    {
		addMouseListener(new MyWindowAdapter(this));
		addMouseMotionListener(new MyWindowAdapter(this));
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

class MyWindowAdapter implements MouseListener,MouseMotionListener
{
	MEventDiffClass f;
	
	MyWindowAdapter(MEventDiffClass t)
	{
		f=t;
	}
	
	public void mouseClicked(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="Mouse Clicked "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="MouseRealeased "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="MouseEntered "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mouseExited(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="MouseExited "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="MouseDragged";
		f.msg="Dragging mouse at "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
		f.mousex=me.getX();
		f.mousey=me.getY();
		f.msg="Moving mouse at "+f.mousex+","+f.mousey;
		f.repaint();
    }
    public void mousePressed(MouseEvent me)
    {
    }
}