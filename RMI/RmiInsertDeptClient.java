import java.rmi.*;

class RmiInsertDeptClient
{
	public static void main(String args[])
	{
		try
		{
			RmiDeptInt x;
			x = (RmiDeptInt)Naming.lookup("dept");
			System.out.println("add : "+x.add(4,2));
			System.out.println("sub : "+x.sub(4,2));
			System.out.println("mul : "+x.mul(4,2));
			System.out.println("div : "+x.div(4,2));
		}catch(Exception e)
		{
		}
	}
}