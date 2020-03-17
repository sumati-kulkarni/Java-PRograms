import java.io.*;
import java.sql.*;

class DbDeptDisp
{
	public static void main(String args[])
	{
		try
		{
			Connection conn = null;
			Statement st = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccompany", "root", "");
					
			st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from dept");
						
			while(rs.next())
			{
				System.out.println("Dno		: "+rs.getInt(1));
				System.out.println("Dname	: "+rs.getString(2));
				System.out.println("DLoc	: "+rs.getString(3));
			}
		}catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}