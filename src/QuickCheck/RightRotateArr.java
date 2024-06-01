package QuickCheck;

import java.util.Arrays;

public class RightRotateArr {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	
	
	int n =2;  // 2 times running the outer loop here.
	 // 5 in constant value.
	int last = arr[arr.length-1];
	
	for (int j=0; j<n;j++)
	{
	
	//int size = arr.length;
	//System.out.println("Size is:" + size);
	 int i; // Accessing array element using
	/// indexing so give as arr[arr.length-1];
	//System.out.println(arr[4]);
//	System.out.println(last);
	// Current value of arr elements is {5,1,2,3,4}:
	//{5,1,2,3,4}, so now --> if arr[4] = 4 but since declared outside
	 // it becomes constant value;
	 
	for(i=arr.length-1;i>0; i--)
	{
		arr[i] = arr[i-1];
	}
	arr[i]= last;
	
	System.out.println(Arrays.toString(arr));
	}
}
}
