import java.io.*;

class CmdPromptFileCopy
{
	public static void main(String args[])throws IOException
	{
		int d;
		char ch;
		if(args.length!=2)
		{
			System.out.println("Enter 2 file names\n");
			System.exit(0);
		}
		
		File sfn, dfn;
		DataInputStream din= new DataInputStream(System.in);
		sfn=new File(args[0]);
		dfn=new File(args[1]);
		
		if(!sfn.exists())
		{
			System.out.println("Not valid File\n");
			System.exit(0);
		}
		
		if(!sfn.isFile())
		{
			System.out.println("Source File Not Found\n");
			System.exit(0);
		}
		
		if(!sfn.canRead())
		{
			System.out.println("Cannot read from this file\n");
			System.exit(0);
		}
		
		if(dfn.exists())
		{
			if(dfn.isDirectory())
			{
				System.out.println("Destination file name already exists");
				System.exit(0);
			}
			System.out.println("File exixts. Overwrite (y/n)");
			ch=(char)din.read();
			if(ch=='N' || ch=='n')
				System.exit(0);
		}
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try
		{
			fin= new FileInputStream(sfn);
			fout=new FileOutputStream(dfn);
			while((d=fin.read())!=-1)
				fout.write(d);
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
		System.out.println("File Copying Successfull");
		fin.close();
		fout.close();
	}
}