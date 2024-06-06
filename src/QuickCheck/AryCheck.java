package QuickCheck;

import java.util.LinkedHashSet;

public class AryCheck {
	public static void main(String[] args) {
		int [] a = {2,3,4,5,6,7};
		int [] b = {7,8,3,4,5,9};
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		
		 for ( int num :  a)
		 {
			 set1.add(num);
		 }
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		
		for ( int num :  b)
		{
			if (set1.contains(num))
			{
				set2.add(num);
			}
		}
		System.out.println(set2);
		
	}

}
