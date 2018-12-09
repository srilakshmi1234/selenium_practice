package javaexamples.pkg;

public class StringReverse 
{
	public static void main(String args[])
	{
		String str="Java is a good programming langauge";		
		String str_split[]=str.split(" ");
		StringBuilder Temp;
		StringBuilder str_rev=new StringBuilder();
		
		for(int index=0;index<str_split.length;index++)
			{
			Temp=	new StringBuilder(str_split[index]);
			System.out.println(Temp);
			str_rev=str_rev.append(Temp.reverse()+" ");			
			}
		
		for(int index=0;index<str_split.length;index++)
		{
			Temp=new StringBuilder(str_split[index]);
			String rev_str="";
			 for(int index1=Temp.length()-1;index1>=0;index1--)
			 {
				 char ch=Temp.charAt(index1);
				 rev_str=rev_str + ch;
			 }
			 System.out.print(rev_str +" ");
		}
		System.out.println();
		System.out.println(str_rev);
		
	}

}
