package Pract;

public class EvenOddElement {
	public static void main(String[] args) {
		int [] arr = {15,20,13,14,23,17};
		
		for (int i=0; i< arr.length; i++)
		{
			if ( arr[i]%2 ==0) System.out.println(arr[i]);
			//else System.out.println("Element is odd:" + arr[i]);
		}
		
		System.out.println("**********************");
		  for (int i=0; i<arr.length; i++)
		  {
			  if ( i%2==0) System.out.println(arr[i]);
		  }
		  System.out.println("**********************");
		  for (int i=0; i< arr.length; i++)
		  {
			   if(i%2!=0)
			   {
				   System.out.println(arr[i]);
			   }
		  }
		
	}

}
