import java.awt.*;
import java.applet.*;

public class AppColor extends Applet
  {
    public void init()
      {
	String bcolor,fcolor;
	bcolor=getParameter("BGColor");
	fcolor=getParameter("FRColor");

	if(bcolor.equals("PINK"))
	  setBackground(Color.pink);

	else if(bcolor.equals("YELLOW"))
	  setBackground(Color.yellow);

	else if(bcolor.equals("WHITE"))
	  setBackground(Color.white);

	if(fcolor.equals("RED"))
	  setForeground(Color.red);

	else if(fcolor.equals("BLACK"))
	  setForeground(Color.black);
      }
    
    public void paint(Graphics g)
      {
	g.drawString("HELLO WORLD",100,100);
      }
  }