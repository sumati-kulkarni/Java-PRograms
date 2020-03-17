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

class ClassEmp
  {
    public static void main(String args[])
      {
        System.out.println("\n\nCreating Single Instance");
        Employee x=new Employee();
        System.out.println("Employee x=new Employee()\n");
        x.read();
        x.disp();
        System.out.println("Creating Multiple References to a Single Instance");
        Employee y=x; 
        System.out.println("Employee x=new Employee()\nEmployee y=x\nHere, x==y\n");
        System.out.println("For x:");
        x.disp();
        System.out.println("For y:");
        y.disp();
        System.out.println("Creating Multiple Instances");
        Employee p=new Employee();
        Employee q=new Employee();
        System.out.println("Employee p=new Employee() = "+p+"\nEmployee q=new Employee() = "+q);
        System.out.println("p!=q");
        System.out.println("Creating Array Of Objects");
        System.out.println("Enter 3 values of Employee");
        Employee a[]=new Employee[3];
        for(int i=0;i<3;i++)
          a[i]=new Employee();
        for(int i=0;i<3;i++)
          {
            System.out.println("Record "+(i+1));
            a[i].read();
          }
        for(int i=0;i<3;i++)
          {
            System.out.println("Record "+(i+1));
            a[i].disp();
          }
      }
  }