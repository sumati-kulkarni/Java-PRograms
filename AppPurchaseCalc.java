import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;

public class AppPurchaseCalc extends Applet implements ActionListener
{


		Label a=new Label("Itemno : ");
		TextField t1=new TextField(10);
		TextField t2=new TextField(10);
		TextField t3=new TextField(10);
		Label b=new Label("Price : ");
		Label c=new Label("Vat : ");
		Button bb=new Button("Calc");
		public int price, vat;
		
		
	public void init()
	{
		setLayout(new GridLayout(6,2));
		add(a);
		add(t1);
		add(b);
		add(t2);
		add(c);
		add(t3);
		
		add(bb);
		bb.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Calc"))
		{
			price = Integer.parseInt(t2.getText());
			vat = Integer.parseInt(t3.getText());
			this.start(price, vat);
		}
	}
	public void start(int p, int v)
	{
		PurchaseFrame f = new PurchaseFrame(p, v);
		f.setSize(100,100);
		f.setVisible(true);
	}
}

class PurchaseFrame extends Frame
{
	
	String msg;
	
	public PurchaseFrame(int p, int v)
	{
	
		msg = "Amt : "+p*v;
	}
		
	public void paint(Graphics g)
	{
		g.drawString(msg, 100, 100);
		g.drawString("\n\nSumi",100,200);
	}
}