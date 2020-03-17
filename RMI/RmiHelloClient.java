import java.rmi.*;

class RmiHelloClient
{
	public static void main(String args[])
	{
		try
		{
			RmiHelloInt x;
			x = (RmiHelloInt)Naming.lookup("hello");
			System.out.println("Message : "+x.sayHello());
		}catch(Exception e)
		{
		}
	}
}