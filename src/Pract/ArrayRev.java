package Pract;

import java.util.ArrayList;

public class ArrayRev {
	public static void main(String[] args) {
		int [] arr = {20,30,40,501,100,1000};
		
		int i = 0;  // starting index.
		int j = arr.length-1;  // Ending index.
		
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;			
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int k=0; k<arr.length; k++ )
		{
			al.add(arr[k]);
			
		}
		System.out.println(al);
	}
	
	

}
