package javaexamples.pkg;

public class MaxSubString
{
	public static void main(String[] args)
	{
		String str="Hello I am SriVerni 122222342";
		StringBuffer sb=new StringBuffer();
		sb.append("hello ").append("sri ").append("verni");
		System.out.println(sb);
		String substr[]=str.split(" ");
		System.out.println(substr.length);
		String long_substr=null;
		int maxlength=0;
		for(String temp:substr)
		{
			if(maxlength < temp.length())
			{
				maxlength=temp.length();
				long_substr=temp;
			}
		}
		System.out.println(maxlength);
		System.out.println(long_substr);
	}

}
