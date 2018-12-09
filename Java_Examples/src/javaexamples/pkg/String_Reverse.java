package javaexamples.pkg;

public class String_Reverse 
{
	public static void main(String[] args)
	{
		String str="hello world";
		StringBuffer str2=new StringBuffer("hello world");
		StringBuilder str3=new StringBuilder("world");
		String str1;
		str1=str.replace("world","sri");
		str2.replace(0, 0, "sssss");
	//	str2.reverse();
		str3.reverse();
	
		System.out.println(str3);
		System.out.println(str2);
		System.out.println(str1);
	}

}
