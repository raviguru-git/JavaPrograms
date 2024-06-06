package QuickCheck;

import java.util.LinkedHashSet;

public class ArrDupl {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,10,20,10,1};
		
	/*	boolean [] b = new boolean [ arr.length];
		
		for (int i=0; i<arr.length; i++)
		{
			if(b[i]==false)
			{ int count=1;
				for (int j=i+1; j<arr.length; j++)
				{
					if (arr[i] == arr[j])
					{
						count++;
						b[j] = true;
					}
				}
				if (count>1)
				System.out.println(arr[i]);
			}
		}*/
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		for ( int num : arr)
		{
			/*
			 * if(!(lh.add(num))) {
			 * 
			 * }
			 */
			lh.add(num);
			
		}
		System.out.println(lh);
		
		
	}
	
	

}
