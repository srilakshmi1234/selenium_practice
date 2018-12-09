package javaexamples.pkg;

public class FirstSecondLargest
{
	public static void main(String[] args)

	{
		int arr_list[]= {1,24,48,21,43,11,79,93};
		int maxone=0;
		int maxtwo=0;
		for(int num:arr_list)
		{
			if(maxone<num)
			{
				maxtwo=maxone;
				maxone=num;
			}
			else if(maxtwo<num)
			{
				maxtwo=num;
			}
		}
		
		System.out.println("maxone = " +maxone + "\n" + "maxtwo = " +maxtwo);
	}
}
