package CodeSignal;

import java.util.Arrays;

public class RotateArrayRight {
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};

		int n = 3;

		for (int j=0; j<n; j++)
		{
			int last = arr[arr.length-1],i;
			for (i=arr.length-1; i>0; i--) // first try for one element rotation.
			{
				arr[i] = arr[i-1];
			}
			arr[i] = last;
		}
		System.out.println(Arrays.toString(arr));




	}

}
