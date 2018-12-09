package javaexamples.pkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{
	public static void main(String args[])
	{
		
		String str="abcdefghcodefgthskcodegthwyjsmcoheabcdefghcofethyrmnqzwrtcodeabcd";
		Pattern p=Pattern.compile("co[a-z]e");
		Matcher m=p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		//	System.out.println(m.start());
		//	System.out.println(m.end());
			
		}
	}

}
