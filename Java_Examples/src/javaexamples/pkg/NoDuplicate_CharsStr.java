package javaexamples.pkg;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicate_CharsStr
{
	public static void main(String[] args)
	{
		String str="aicdefghabcdefghijklabcdefgh";
	  	char str1=str.charAt(0);
		String max_str=null,temp_str="";
		int startindex=0;
		int maxstr_length=0;
		for(int i=1;i<str.length();i++)
		{
			if(str1==str.charAt(i))
			{				
				temp_str=str.substring(startindex,i);
				startindex=i;		
			}
			else if(i==str.length()-1)
			{
				temp_str=str.substring(startindex,i+1);
			}			
			if(maxstr_length<temp_str.length())
			{
				max_str=temp_str;
				maxstr_length=temp_str.length();				
			}			
		}
		System.out.println(max_str);
	}

}
