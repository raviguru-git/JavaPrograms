package QuickCheck;

import java.util.Arrays;

public class StrngRotate {
	public static void main(String[] args) {
		String [] arr = {"RGP", "SGR", "PVR","VA"};
		int n=2,j;
		for (j=0; j<n; j++)
		{
		String last = arr[arr.length-1]; int i;
		
		for (i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[i] = last;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
