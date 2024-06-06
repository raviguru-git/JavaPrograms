package QuickCheck;

import java.util.LinkedHashSet;

public class CommnArryElemnt {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {4,5,6,7,8};
		int sum = 9;
		
		   LinkedHashSet<Integer> res = findcommonElements(arr1,arr2);
		   System.out.println(res);
	}
	
	public static LinkedHashSet<Integer> findcommonElements(int[] a , int [] b)
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		for (    int num : a )
		{
			set1.add(num);
		}
		
		LinkedHashSet<Integer> commonElements = new LinkedHashSet<>();
		for( int num :   b)
		{
			if ( set1.contains(num))
			{
				commonElements.add(num);
			}
		}
		
		return commonElements;
    }

	
	
	
		
	}
	

