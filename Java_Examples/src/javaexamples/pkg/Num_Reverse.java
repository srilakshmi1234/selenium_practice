package javaexamples.pkg;

import java.util.Scanner;

public class Num_Reverse
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        int revnum=0;
        while(num!=0)
        {
        	revnum=revnum*10 + (num%10);
        	num=num/10;
        }
        System.out.println(revnum);
    }
}
