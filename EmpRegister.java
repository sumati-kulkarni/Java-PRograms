import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;

public class EmpRegister extends JApplet
{
public void init()
{
setLayout(new GridLayout(15,2));
JLabel a=new JLabel("NAME");
add(a);
JTextField t1=new JTextField(10);
add(t1);
JLabel b=new JLabel("ADDRESS");
add(b);
JTextField t2=new JTextField(10);
add(t2);
JLabel c=new JLabel("MOBNO");
add(c);
JTextField t3=new JTextField(10);
add(t3);
JLabel d=new JLabel("USN");
add(d);
JTextField t4=new JTextField(10);
add(t4);
JLabel e=new JLabel("EMAIL");
add(e);
JTextField t5=new JTextField(20);
add(t5);
JLabel f=new JLabel("PINCODE");
add(f);
JTextField t6=new JTextField(10);
add(t6);
JLabel g=new JLabel("USERNAME");
add(g);
JTextField t7=new JTextField(10);
add(t7);
JLabel h=new JLabel("PASSWORD");
add(h);
JTextField t8=new JTextField(10);
add(t8);
JButton t=new JButton("REGISTER");
add(t);
}
}

