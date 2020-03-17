import java.io.*;

class FileRead
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("Letter.doc");
			int ch;
			System.out.println("File Contents\n");
			do
			{
				ch=fin.read();
				System.out.print((char)ch);
			}while(ch!=-1);
			fin.close();
		}catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}