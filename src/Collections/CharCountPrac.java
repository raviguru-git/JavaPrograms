package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCountPrac {
	public static void main(String[] args) {
		String s = "$$RaviG$$$**&&() &";
		
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (  char ch : s.toCharArray())
		{   if (!(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'))
			if (charCount.containsKey(ch))
			{
				charCount.put(ch, charCount.get(ch)+1);
			}
			else
			{
				charCount.put(ch, 1);
			}
		}
		 
		/*
		 * for ( Entry<Character, Integer> entrySet : charCount.entrySet()) {
		 * System.out.println("Characters is==> " + entrySet.getKey() + ": " +
		 * "Values is: ==> "+ entrySet.()); }
		 */
		mapPrint(charCount);
		 
	}
	
	public static <K,V> void mapPrint(Map <K,V> map)
	{
		for ( Entry<K, V> entry :   map.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
