package javaexamples.pkg;

import java.util.HashMap;

public class DuplicateWord
{
   public static void main(String args[])
   {
	   String str[]= {"abc","bcd","def","abc","bcd","hef","abc","fff","bcd"};
	   HashMap <String,Integer> dupl_hsmp_cnt=new HashMap<String,Integer>();
//	   HashMap <String,Integer> strhsmp=new HashMap<String,Integer>();
//	   strhsmp.put("abc", 1);
//	   strhsmp.put("abbc", 2);
//	   strhsmp.put("abc", 3);
//	   strhsmp.put("abc", 4);
//	   System.out.println(strhsmp);
	   for(String str_temp:str)
	   {
		   if(dupl_hsmp_cnt.containsKey(str_temp))
		   {
			   dupl_hsmp_cnt.put(str_temp,dupl_hsmp_cnt.get(str_temp)+1);
			   
		   }
		   else
		   {
			   dupl_hsmp_cnt.put(str_temp,1);
		   }
	   }
	   
	   System.out.println(dupl_hsmp_cnt);
   }
}
