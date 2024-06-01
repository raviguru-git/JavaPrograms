package QuickCheck;

import java.util.Arrays;

public class DbldimArrLargeElemn {
	public static void main(String[] args) {
		int [] [] arr = {{10,20,30}, {100,200,23,34},{35,69,90}};
		
		int large = arr[0] [0];
		
		for (int i=0; i< arr.length;i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (arr[i][j] > large)
				{
					large = arr[i][j];
				}
			}
		}
		System.out.println(large);
		
		
	}
	

}
