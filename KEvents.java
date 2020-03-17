import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KEvents extends Applet implements KeyListener
{
   String msg="";
   int x=10,y=20;

   public void init()
   {
      addKeyListener(this);
      requestFocus();
   }

   public void keyPressed (KeyEvent ke)
   {
      showStatus("Key Pressed");
      repaint();
   }

   public void keyReleased (KeyEvent ke)
   {
      showStatus("Key Released");
      repaint();
   }

   public void keyTyped (KeyEvent ke)
   {
      showStatus("Key Typed");
      msg+=ke.getKeyChar();
      repaint();
   }

   public void paint (Graphics g)
   {
      g.drawString (msg,x,y);
   }

}
