package javaexamples.pkg;

import java.util.Scanner;

public class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int Prime_limit=sc.nextInt();
		int flag=1;
		System.out.println(Prime_limit);
		for(int i=1;i<=Prime_limit;i++)
		{
			flag=1;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
			 if(i%j==0)
				{
			      System.out.println(i +"is not prime");
			   //   System.out.println(i +" " + j );
			      flag=0;
			      break;
				}
			}
			
		if(flag==1)
		{
			System.out.println(i +"is a prime number");
		}
		}
	}

}
