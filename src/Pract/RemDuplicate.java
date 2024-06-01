package Pract;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemDuplicate {
	public static void main(String[] args) {
		String s1 = "RAAVvvvmmmmI";
		char [] ch = s1.toCharArray();
		
		LinkedHashSet <Character> lh = new LinkedHashSet<Character>();
		

		StringBuilder sb = new StringBuilder();
		for (   char letter : ch )
		{
			if (lh.add(letter))// add returns false if element is already present
			{
			sb.append(letter);
			}
			
		}
		System.out.println(sb.toString());
		
		
		
		
		
		
	}
	

}
