import java.rmi.*;

class RmiHelloReg
{
	public static void main(String args[])
	{
		try
		{
			RmiHelloImp x = new RmiHelloImp();
			Naming.rebind("hello",x);
		}catch(Exception e)
		{
		}
	}
}