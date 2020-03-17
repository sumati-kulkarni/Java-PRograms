import java.rmi.*;
import java.ejb.*;

public class BeanHello implements SessionBean
{
	public void ejbCreate() throws RemoteException
	{
	}
	public void ejbActivate() throws RemoteException
	{
	}
	public void ejbPassivate() throws RemoteException
	{
	}
	public void ejbRemove() throws RemoteException
	{
	}
	public void setSessionContext(SessionContext sc)
	{
	}
	public String sayHello() throws RemoteException
	{
		return ("Hello World");
	}
}