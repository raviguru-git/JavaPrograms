package Collections;

import java.util.HashMap;
import java.util.Map;

public class StrRpt1 {
	public static void main(String[] args) {
		String s = "HelloJava@@#&&%";
		
		Map<Character,Integer> countMap = new HashMap<>();
		char [] ch = s.toCharArray();
		
		for (  char keys :  ch )
		{
			if(countMap.containsKey(keys) )
			{
				countMap.put(keys, countMap.get(keys)+1); // Here since one entry for 
						           // key already exist below we increment it by 1.
			}
			else
			{
				countMap.put(keys, 1);  
		 // Initially Map is empty so we need to put the keys first.
				
			}
			
				
		}
		System.out.println(countMap);
		
		
		
		
		
	}
}
