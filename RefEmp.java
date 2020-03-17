// Program To Pass Reference Objects

import java.io.*;


class Employee
  {
    private int empno,sal;
    private String name;
    
    public void read()
      {
        DataInputStream cin=new DataInputStream(System.in);
        try
          {
            System.out.print("Enter Employee Number : ");
            empno=Integer.parseInt(cin.readLine());
            System.out.print("\nEnter Employee Name : ");
            name=cin.readLine();
            System.out.print("\nEnter Employee Salary : ");
            sal=Integer.parseInt(cin.readLine());
          }catch(Exception e)
             {
               System.out.println("Error : "+e);
             }
      }
    public void disp()
      {
        System.out.println("EMP_NO\tNAME\tSALARY\n");
        System.out.println(empno+"\t"+name+"\t"+sal);
      }
  }

class RefEmp
  {
    public static void main(String args[])
      {
         Employee x=new Employee();
         readdata(x);
         dispdata(x);
      }
    static void readdata(Employee t)
      {
         t.read();
      }
    static void dispdata(Employee t)
      {
         t.disp();
      }
  }