import java.io.*;
import java.sql.*;

class JDBC
  {
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	

	void EstablishConnection()
	  {
	    try
	      {
	        Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
	        conn=DriverManager.getConnection("jdbc:odbc:ORA","scott","tiger");
	        st=conn.createStatement();
	      }catch(ClassNotFoundException e1)
	         {
		    System.out.println("Error : "+e1);
	         }
	       catch(SQLException e2)
	         {
		    System.out.println("Error : "+e2);
	         }
	       catch(Exception e3)
	         {
		    System.out.println("Error : "+e3);
	         }
	  }


	void DisplayData()
	  {
	    try
	      {
		rs=st.executeQuery("Select * from Student");
		System.out.println("Student Details");
		while(rs.next())
		  {
		    System.out.println(rs.getString("ROLLNUMBER")+" "+rs.getString("NAME")+" "+rs.getString("DOB")+" "+rs.getInt("MARKS")+" "+rs.getInt("PERCENTAGE"));
		  }
		rs.close();
	      }catch(Exception e)
		 {
		    System.out.println("Error : "+e);
		 }
	  }


	void InsertData()
	  {
	    try
	      {
		int marks,per,count;
	    	String rno,name,dob;
	    	DataInputStream din=new DataInputStream(System.in);
	    	char ch;
	    	do
	      	  {
		    System.out.println("Enter Student Details");
		    System.out.print("Enter Roll Number : ");
		    rno=din.readLine();
		    System.out.print("\nEnter Name : ");
		    name=din.readLine();
		    System.out.print("\nEnter Date Of Birth : ");
		    dob=din.readLine();
		    System.out.print("\nEnter Marks : ");
		    marks=Integer.parseInt(din.readLine());
		    per=(marks/600)*100;
		    count=st.executeUpdate("Insert into Student values("+rno+"','"+name+"','"+dob+"','"+marks+"','"+per+"')'");
		    if(count==1)
		      System.out.println("1 Record Inserted");
		    System.out.println("Any more Records (Y/N)?");
		    ch=(char)din.read();
	          }while(ch=='Y');
	      }catch(Exception e)
		 {
		    System.out.println("Error : "+e);
		 }
	  }

	void DeleteData()
	  {
	    try
	      {
		int marks,per,count;
	    	String rno,name,dob;
	    	DataInputStream din=new DataInputStream(System.in);
	    	char ch;
	    	do
	      	  {
		    System.out.print("Enter The Roll Number Of Student To Be Deleted : ");
		    rno=din.readLine();
		    count=st.executeUpdate("\nDelete from Student where rollnumber="+rno);
		    if(count==0)
		      System.out.println("Record Not Found");
		    else
		      System.out.println("1 Record Deleted");
		    System.out.println("Any more Records (Y/N)?");
		    ch=(char)din.read();
	          }while(ch=='Y');
	      }catch(Exception e)
		 {
		    System.out.println("Error : "+e);
		 }
	  }


	public static void main(String args[])
	  {
	    try
	      {
		int ch;
		DataInputStream din=new DataInputStream(System.in);
		JDBC x=new JDBC();
		x.EstablishConnection();
		for(;;)
		  {
		    System.out.println("\n1->Insert");
		    System.out.println("\n2->Delete");
		    System.out.println("\n3->Display");
		    System.out.println("\n4->Exit");
		    System.out.println("\nEnter your choice : ");
		    ch=Integer.parseInt(din.readLine());
		    switch(ch)
		      {
			case 1: x.InsertData();
				break;
			case 2: x.DeleteData();
				break;
			case 3: x.DisplayData();
				break;
			case 4: x.rs.close();
				System.exit(0);
			default: System.out.println("Invalid choice");
				 break;
		      }
		  }
	      }catch(Exception e)
		 {
		   System.out.println("Error : "+e);
		 }
	  }


  }