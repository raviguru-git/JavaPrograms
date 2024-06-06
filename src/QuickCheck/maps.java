package QuickCheck;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class maps {
	
	public static void main(String[] args) {
		
		int [] arr2 = {2,3,4,5,6,2,4};
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for ( int numbr : arr2)
		{
			mp.put(numbr, mp.getOrDefault(numbr, 0)+1);
		}
		System.out.println(mp);
		
		for (   Entry<Integer, Integer> keys :  mp.entrySet())
		{
			System.out.println("Number:" + keys.getKey() + "," + "Count:===>" + keys.getValue() );
		}
		
		/*
		 * Initialization:
		 * 
		 * countMap is an empty HashMap. First Iteration (num = 2):
		 * 
		 * countMap.getOrDefault(2, 0)
		 *  returns 0 (since 2 is not in the map).
		 *   0 + 1 is  1.
		 * countMap.put(2, 1) adds 2 with a count of 1. 
		 * Second Iteration (num = 3):
		 * * countMap.getOrDefault(3, 0) returns 0 (since 3 is not in the map). 0 + 1 is
		 * 1. countMap.put(3, 1) adds 3 with a count of 1.
		 * Third Iteration (num = 2):
		 * countMap.getOrDefault(2, 0) returns 1 (since 2 is already in the map with a count of 1).
         * 1 + 1 is 2.  countMap.put(2, 2) updates the count of 2 to 2.
		 */
	}

}
