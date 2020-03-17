import java.rmi.*;
import java.rmi.server.*;

public class RmiHelloImp extends UnicastRemoteObject implements RmiHelloInt
{
	public RmiHelloImp() throws RemoteException
	{
		super();
	}
	public String sayHello() throws RemoteException
	{
		return ("Hello World");
	}
}

