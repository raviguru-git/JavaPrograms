package Pract;

import java.util.HashMap;

public class Chaoccurence {
	public static void main(String[] args) {
		String s1 = "aaabbbcc#$";
		
		char [] c = s1.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for ( char ch : c)
		{
			if(!(ch >='a' && ch<='z' || ch>='A' && ch<='Z'))
			if(hm.containsKey(ch))
		 	{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
		
		
	}

}
