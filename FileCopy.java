import java.io.*;

class FileCopy
{
	public static void main(String args[])throws IOException
	{
		int ch;
		String sfn, dfn;
		DataInputStream din= new DataInputStream(System.in);
		System.out.println("Enter Source File Name : ");
		sfn=din.readLine();
		System.out.println("Enter Destination File Name : ");
		dfn=din.readLine();
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try
		{
			fin= new FileInputStream(sfn);
			fout=new FileOutputStream(dfn);
		}catch(FileNotFoundException e)
		{
			System.out.println("Source File Not Found");
			System.exit(0);
		}
		//catch(IOException e)
		//{
		//	System.out.println("Error in creating file");
		//	fin.close();
		//	System.exit(0);
		//}
		while((ch=fin.read())!=-1)
		{
			fout.write(ch);
		}
		System.out.println("File Copying Successfull");
		fin.close();
		fout.close();
	}
}