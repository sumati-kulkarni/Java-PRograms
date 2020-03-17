import java.rmi.*;
import java.rmi.server.*;

public class RmiArithImp extends UnicastRemoteObject implements RmiArithInt
{
	public RmiArithImp() throws RemoteException
	{
		super();
	}
	public double add(double a, double b) throws RemoteException
	{
		return a+b;
	}
	public double sub(double a, double b) throws RemoteException
	{
		return a-b;
	}
	public double mul(double a, double b) throws RemoteException
	{
		return a*b;
	}
	public double div(double a, double b) throws RemoteException
	{
		return a/b;
	}
}

