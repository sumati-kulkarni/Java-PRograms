import java.io.*;

class ByteArrayIS
{
	public static void main(String args[])throws IOException
	{
		String s="Hello World";
		byte b[]=s.getBytes();
		ByteArrayInputStream bin=new ByteArrayInputStream(b);
		int ch;
		
		while((ch=bin.read())!=-1)
		{
			System.out.println(""+Character.toUpperCase((char)ch));
		}
		
		bin.close();
	}
}