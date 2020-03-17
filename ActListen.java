import java.awt.*;
import java.awt.event.*;

class ActListen extends Frame implements ActionListener
  {
    Label l;
    Button bok,bcancel;

    ActListen()
      {
	setLayout(null);
	l=new Label();
	bok=new Button("OK");
	bcancel=new Button("CANCEL");

	l.setSize(200,30);
	l.setLocation(50,50);
	l.setVisible(true);

	bok.setSize(60,30);
	bok.setLocation(60,200);
	bok.setVisible(true);

	bcancel.setSize(100,30);
	bcancel.setLocation(200,200);
	bcancel.setVisible(true);

	add(l);
	add(bok);
	add(bcancel);

	bok.addActionListener(this);
	bcancel.addActionListener(this);

	addWindowListener(new WindowAdapter()
				{
				  public void windowClosing(WindowEvent we)
					{
					  System.exit(0);
					}
				}
			 );
      }

    public static void main(String args[])
      {
	ActListen f=new ActListen();
	f.setSize(400,400);
	f.setVisible(true);
      }

    public void actionPerformed(ActionEvent ae)
      {
      }

  }

