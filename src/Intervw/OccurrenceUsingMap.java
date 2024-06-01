package Intervw;

import java.util.HashMap;
import java.util.Map.Entry;

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
		// To traversing through each element in  map we are 
		// going to entrySet()
		for ( Entry<Character, Integer> entry : hm.entrySet())
		{
			//if (entry.getValue() == 1 )
		//	{
				System.out.println(  entry.getKey() + ":" + entry.getValue());
			//}
		}
		System.out.println(hm.entrySet());
		
		
		
	}

}
