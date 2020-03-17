import java.rmi.*;

public interface RmiDeptInt extends Remote
{
	public boolean insertDept(int dno, String dname, String dloc) throws RemoteException;
	public boolean updateDept(int dno, String dname, String dloc) throws RemoteException;
	public boolean deleteDept(int dno) throws RemoteException;
}

