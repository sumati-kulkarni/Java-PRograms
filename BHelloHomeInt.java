import java.rmi.*;
import java.ejb.*;

public interface BHelloHomeInt extends EJBHome
{
	public BHelloRemoteInt create() throws RemoteException;
}
