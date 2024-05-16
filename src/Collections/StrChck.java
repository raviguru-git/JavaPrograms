package Collections;

import java.util.HashMap;
import java.util.Map;

public class StrChck {
	public static void main(String[] args) {
		String s = "RAVIGuru@@@$$%%!!!";
	  Map<Character, Integer> countMapString = countOccurencesString(s);
	  System.out.println("Occurencess in string:");
	  printMap(countMapString);
	  
		
	}
	
	public static Map<Character, Integer> countOccurencesString(String str)
	{
		Map<Character, Integer> countMap = new HashMap<>();
		
		for ( char ch : str.toCharArray())
		{   
			//ch = Character.toUpperCase(ch);  // To make lower-case to UpperCase here.
			if (Character.isLetter(ch))				
			{
				countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
			}
		}
		return countMap;
		
	}	
		
		 public static <K, V> void printMap(Map<K, V> map) {
		        for (Map.Entry<K, V> entry : map.entrySet()) {
		            System.out.println(entry.getKey() + " : " + entry.getValue());
		        }
		    }
		
		
	}
	

