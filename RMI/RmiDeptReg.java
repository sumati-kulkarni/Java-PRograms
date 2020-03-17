import java.rmi.*;

class RmiDeptReg
{
	public static void main(String args[])
	{
		try
		{
			RmiDeptImp x = new RmiDeptImp();
			Naming.rebind("dept",x);
		}catch(Exception e)
		{
		}
	}
}