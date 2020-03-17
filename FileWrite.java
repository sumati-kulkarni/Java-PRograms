import java.io.*;

class FileWrite
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("Letter.doc");
			DataInputStream din=new DataInputStream(System.in);
			int ch;
			System.out.println("Enter File Contents\n");
			do
			{
				ch=din.read();
				fout.write(ch);
			}while((char)ch!='#');
			fout.close();
		}catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}