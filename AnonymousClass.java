import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
  {
    String msg;
	int x,y;

    MyFrame()
      {
	msg="";
	addMouseListener(new MouseAdapter()
      				{
				  public void mouseClicked(MouseEvent me)
          				{
						  x=me.getX();
						  y=me.getY();
	    				  msg="Mouse Clicked "+x+","+y;
	    				  repaint();
          				}
				  public void mouseMoved(MouseEvent me)
          				{
						  x=me.getX();
						  y=me.getY();
	    				  msg="Mouse Moved "+x+","+y;
	    				  repaint();
          				}
				  public void mouseEntered(MouseEvent me)
          				{
	    				  x=me.getX();
						  y=me.getY();
						  msg="Mouse Entered "+x+","+y;
	    				  repaint();
          				}
				  public void mousePressed(MouseEvent me)
          				{
	    				  x=me.getX();
						  y=me.getY();
						  msg="Mouse Pressed "+x+","+y;
	    				  repaint();
          				}
				  public void mouseReleased(MouseEvent me)
          				{
	    				  x=me.getX();
						  y=me.getY();
						  msg="Mouse Released "+x+","+y;
	    				  repaint();
          				}
				  public void mouseExited(MouseEvent me)
          				{
	    				  x=me.getX();
						  y=me.getY();
						  msg="Mouse Exited "+x+","+y;
	    				  repaint();
          				}
				  public void mouseDragged(MouseEvent me)
          				{
						  x=me.getX();
						  y=me.getY();
	    				  msg="Mouse Dragged "+x+","+y;
	    				  repaint();
          				}
      				}
			);
	addWindowListener(new WindowAdapter()
				{
				  public void windowClosing(WindowEvent we)
					{
					  System.exit(0);
					}
				}
			 );
      }

    public void paint(Graphics g)
      {
	g.drawString(msg,100,100);
      }

  }


class AnonymousClass
  {
    public static void main(String args[])
      {
	MyFrame f=new MyFrame();
	f.setSize(400,400);
	f.setVisible(true);
      }
  }
