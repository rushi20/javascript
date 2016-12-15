package demo;

import java.io.*;

public class file {

	public static void main(String r[])
	{
		try{
			FileReader fr=new FileReader("C:/Users/pirate/Desktop/1.txt");
		BufferedReader br=new BufferedReader(fr);
		int cunt=0,f=0,d=0,g=0;
		
		String s=new String();
		
		//char[] c=new char[100];
		//s=br.readline();
		
		//String s1=new String("rushi");
		while((s=br.readLine())!=null){
			
			System.out.println(s);
			
			String[] s2=s.split(" ");
			
			for(int j=0;j<s2.length;j++)
			{
					g++;
					String s4=s2[j];
					if(s4.equalsIgnoreCase("$")==true)
					{
						System.out.println("found");
					}
			}
			
		char c[]=s.toCharArray();
			d=s.length();
			for(int i2=0;i2<c.length;i2++){
				
			if(c[i2]=='$')
			{
				cunt++;
				
			}
			}
			//System.out.println("cg"+c);
		}
			//int i1=br.read();
		System.out.println("a:"+cunt);
	//	System.out.println("linse:"+f);
		System.out.println("character:"+d);
	//	System.out.println("words:"+g);
		//System.out.println("ttl :"+(g+f));
	
		//bw.close();
			br.close();
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
	}
}
