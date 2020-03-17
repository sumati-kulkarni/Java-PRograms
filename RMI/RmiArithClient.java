import java.rmi.*;

class RmiArithClient
{
	public static void main(String args[])
	{
		try
		{
			RmiArithInt x;
			x = (RmiArithInt)Naming.lookup("arith");
			System.out.println("add : "+x.add(4,2));
			System.out.println("sub : "+x.sub(4,2));
			System.out.println("mul : "+x.mul(4,2));
			System.out.println("div : "+x.div(4,2));
		}catch(Exception e)
		{
		}
	}
}