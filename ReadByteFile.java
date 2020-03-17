import java.io.*;

class ReadByteFile
{
	public static void main(String args[])throws IOException
	{
		File sfn=new File("Letter.doc");
		int i=(int)sfn.length();
		byte b[]=new byte[i];
		FileInputStream fin= new FileInputStream(sfn);
		fin.read(b);
		String str=new String(b);
		System.out.println(str);
		fin.close();
	}
}