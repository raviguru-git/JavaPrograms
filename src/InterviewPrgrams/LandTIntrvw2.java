package InterviewPrgrams;

import java.util.Arrays;

public class LandTIntrvw2 {
	public static void main(String[] args) {
		// i/p  9, 5, 7, 1, 8, 3, 4, 3
		// o/p - find min value.
		
		int [] arr = {9, 5, 7, 1, 8, 3, 4};
		
		/*
		 * int min=arr[0];
		 * 
		 * for( int i=0; i<arr.length; i++) { if(arr[i] < min) { min = arr[i]; }
		 * 
		 * 
		 * } System.out.println(min);
		 */
		// And then sort the array also.
		for (int i=0; i<arr.length-1; i++) // for number of passes.
		{
			for ( int j=0; j<arr.length-1; j++) // to compare the elements.
			{
				if ( arr[j] > arr[j+1])
				{
				
				int temp = arr[j];
				arr[j] = arr [j+1];
				arr[j+1] = temp;
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		

			
	}

}
