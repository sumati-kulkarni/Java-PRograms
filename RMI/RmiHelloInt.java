import java.rmi.*;

public interface RmiHelloInt extends Remote
{
	public String sayHello() throws RemoteException;
}

