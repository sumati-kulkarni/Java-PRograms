import java.rmi.*;
import java.rmi.server.*;

public class RmiDeptImp extends UnicastRemoteObject implements RmiDeptInt
{
	private Connection conn;
	
	public RmiDeptImp() throws RemoteException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/ccompany", "root", "");
		}catch(Exception e)
		{
		}
	}
	
	public boolean insertDept(int dno, String dname, String dloc)
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("insert into dept values(?, ?, ?)");
			ps.setInt(1, dno);
			ps.setString(2, dname);
			ps.setString(3, dloc);
			count = ps.executeUpdate();
			if(count == 0)
				return false;
			else
				return true;
		}catch(Exception e)
		{
		}
	}
	
	public boolean updateDept(int dno, String dname, String dloc) throws RemoteException
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("update dept set dname=?, dloc=? where dno=?");
			ps.setString(1, dname);
			ps.setString(2, dloc);
			ps.setInt(3, dno);
			int count = ps.executeUpdate();
			if(count==0)
				return false;
			else
				return true;
		}catch(Exception e)
		{
		}
	}
	
	public boolean deleteDept(int dno) throws RemoteException
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("delete from dept where dno = ?");
			ps.setInt(1, dno);
			int count = ps.executeUpdate();
			if(count == 0)
				return false;
			else
				return true;
		}catch(Exception e)
		{
		}
	}
}

