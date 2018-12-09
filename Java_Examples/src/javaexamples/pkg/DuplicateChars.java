package javaexamples.pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChars
{
	public static void main(String[] args)
	{
		Set <Integer> set=new HashSet<Integer>();
		Set <Integer> Tempset=new HashSet<Integer>();

		ArrayList <Integer> list = new ArrayList<Integer>();
		ArrayList <Integer> list1 = new ArrayList<Integer>();

		for(int i=0;i<20;i++)
		{
			list.add(i);
			
		}
		for(int i=0;i<4;i++)
		{
			list.add(i);			
		}
		for(int i=20;i<29;i++)
		{
			list.add(i);
			
		}
		System.out.println(list);
		for(int temp:list)
		{
			
			if(!(Tempset.add(temp)))
			{
				set.add(temp);
			//	list1.add(temp);
			}
		}
		System.out.println(set);
		//System.out.println(list1);
		System.out.println(Tempset);
		



	}

}
