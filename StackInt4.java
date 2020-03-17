import java.io.*;

interface istack1
  {
    boolean isFull();
    boolean isEmpty();
  }




interface istack2
  {
    void push(int d);
    int pop();
	void disp();
	int TopOfStack();
  }




class cstack1 implements istack1
{
	
	int s[];
    int top;
    
    cstack1(int n)
      {
        int s[]=new int[n];
	top=-1;
      }
	  
	public boolean isFull()
      {
        if(top==(s.length-1))
          return true;
	else
	  return false;
      }
  
    public boolean isEmpty()
      {
	if(top==-1)
	  return true;
	else
	  return false;
      }
	  
}

class cstack2 extends cstack1 implements istack2
  {
    
	cstack2(int n)
      {
        super(n);
      }
	  
    public void push(int x)
      {
	if(isFull())
	  System.out.println("Stack Overflow");
	else
	  {
	    top++;
	    s[top]=x;
	    System.out.println("Entered Element : "+s[top]);
	  }
      }
    public int pop()
      {
	if(isEmpty())
	  {
	    System.out.println("Stack Underflow");
	    return 0;
	  }
	else
	  return s[top--];  
      }

    public int TopOfStack()
      {
	if(isEmpty())
	  {
	    System.out.println("Stack Is Empty");
	    return 0;
	  }
	else
	  return s[top];
      }
   
    public void disp()
      {
	if(isEmpty())
	  System.out.println("Stack Is Empty");
	else
	  {
	    System.out.println("Stack Elements Are");
	    for(int i=0;i<=top;i++)
	      System.out.println(""+s[i]);
	    if(isFull())
	      System.out.println("Stack Full");
	  }
      }
  }




class StackInt4
  {
    public static void main(String args[])
     {
       try
       {
	int ss,ch;
	istack2 y;
	int d,n;
	DataInputStream din=new DataInputStream(System.in);
	System.out.println("Enter The Size Of Stack : ");
	n=Integer.parseInt(din.readLine());
    	y=new cstack2(n);
    	for(;;)
      	  {
		System.out.println("\n1 push\n2 pop\n3 top of stack\n4 display\n5 exit\n\nenter your choice\n");
		ch=Integer.parseInt(din.readLine());
		switch(ch)
	  	  {
	    	    case 1 : System.out.print("\nEnter Data To Be Entered : ");
			     d=Integer.parseInt(din.readLine());
			     y.push(d);
		     	     break;
	    	    case 2 : d=y.pop();
			     System.out.println("Deleted Element : "+d);
		     	     break;
	    	    case 3 : d=y.TopOfStack();
			     System.out.println("Top Of Stack : "+d);
		             break;
	            case 4 : y.disp();
		             break;
	    	    case 5 : System.exit(0);
	    	    default : System.out.println("Invalid choice\n");
	   	  }
          }
       }catch(Exception e)
	  {
	    System.out.println("Error : "+e);
	  }
      }
  }
    
	