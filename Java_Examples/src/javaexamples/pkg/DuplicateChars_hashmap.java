package javaexamples.pkg;

import java.util.HashMap;

public class DuplicateChars_hashmap {

	public static void main(String[] args)
	{
	   String str="Java Java Java";
	   HashMap <Character,Integer> hsmp=new HashMap<Character,Integer>();
	   char ch_array[]=str.toCharArray();
	   int cnt=0;
	   for(char ch:ch_array)
	   {
		   if(hsmp.containsKey(ch))
		   {
			  //character present
			   
			   hsmp.put(ch,hsmp.get(ch)+1);
		   }
		   else
		   {
			   //character not present
			   hsmp.put(ch,1);
			   
		   }
	   }
	  System.out.println(hsmp);

	}

}
