import java.rmi.*;
import java.ejb.*;

public interface BHelloRemoteInt extends EJBObject
{
	public String sayHello() throws RemoteException;
}