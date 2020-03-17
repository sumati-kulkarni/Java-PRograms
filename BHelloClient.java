import java.rmi.*;
import java.ejb.*;

public class BHelloClient
{
	public static void main(String args[]) throws RemoteException, CreateException
	{
		Properties p = System.getProperties();
		InitialContext ic = new InitialContext(p);
		BHelloHomeInt h = (BHelloHomeInt) ic.lookup("HELLO");
		BHelloRemoteInt hb = (BHelloRemoteInt) h.create();
		System.out.println("Message : "+hb.sayHello());
	}
}