package Intervw;

import java.util.HashMap;

public class OccurrenceUsingMap {
	public static void main(String[] args) {
		String s="aaabbbccddae";
		char [] c=s.toCharArray();
		HashMap< Character, Integer>hm=new HashMap<>();
		for(char ch : c)
		{
			//a
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}

}
