import java.rmi.*;

class RmiArithReg
{
	public static void main(String args[])
	{
		try
		{
			RmiArithImp x = new RmiArithImp();
			Naming.rebind("arith",x);
		}catch(Exception e)
		{
		}
	}
}