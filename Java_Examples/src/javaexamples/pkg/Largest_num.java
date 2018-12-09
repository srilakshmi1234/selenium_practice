package javaexamples.pkg;

public class Largest_num
{
      public static void main(String args[])
       {
	      int arr[]= {10,80,1,3,30,7,2,98,1,2};
	      int smallest_num=arr[0],largest_num=arr[0];
	      for(int i=1;i<arr.length;i++)
	      {
	         if(smallest_num>arr[i])
	         {
	        	 smallest_num=arr[i];
	         }
	      }
	      
	      for(int i=1;i<arr.length;i++)
	      {
	    	  if(largest_num<arr[i])
	    	  {
	    		 largest_num=arr[i];
	    	  }
	      }
	     System.out.println("largest number" +largest_num);
	     System.out.print(" smallest number" +smallest_num);
       }
}
