import java.io.*;

class CharacterArrayReader
{
	public static void main(String args[]) throws IOException
	{
		String s="Sumati Kulkarni";
		char c[]=new char[s.length()];
		s.getChars(0,s.length(),c,0);
		CharArrayReader cin=new CharArrayReader(c);
		int ch;
		
		while((ch=cin.read())!=-1)
			System.out.println(Character.toUpperCase((char)ch));
		
		cin.close();
	}
}