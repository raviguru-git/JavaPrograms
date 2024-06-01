package CodeSignal;

import java.util.Arrays;

public class RotateArrayRight {
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,8};

		int n = 2 ;
		int i=2;
		// int last = arr[arr.length-1]; If you declare outside then always
		// it will hold 8 value only it will not change.
		for (int j=0; j<n; j++)
		{
			int last = arr[arr.length-1]; // Declare here it will take
			// the current index of a[4] = 4; or will be 4 actually.
			for (i=arr.length-1; i>0; i--) // first try for one element rotation.
			{
				System.out.println("Now printing i in inner loop" + i);
				arr[i] = arr[i-1];
				
				//System.out.println(arr[i]);
			}
			arr[i] = last;
			
			System.out.println(Arrays.toString(arr));
		}
		




	}

}
