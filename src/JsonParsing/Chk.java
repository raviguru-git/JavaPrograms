package JsonParsing;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Chk {
	public static void main(String[] args) {
		String s="Checkr  epet  itive Checkr epet";
		String [] s1 = s.split(" ");
		 char [] ch = s.toCharArray();
		 boolean [] b = new boolean [ch.length];
		 
		 for (int i=0; i<ch.length; i++)
		 {
			 if ( b[i] == false)
			 {   int count = 1;
				 for  (int j=i+1; j<ch.length; j++) // Setting j=i+1, immediate or next
					                                //index for comparison.
				 {
					 if(ch[i] == ch [j])
					 {
						 count++;
						 b[j] = true; // Set b[j] = true, once the letter is found.
						 
					 }
				 }
				 System.out.println(ch[i] +" "+count); // Very important, concatenate with
				                                  // String here else it will add the count number.
			 }
		 }
		
		Map<String,Integer> mp = new HashMap<>();
		
		
		
		for(  String letter : s1)
		{
			mp.put(letter, mp.getOrDefault(letter, 0)+1);
			
		}
		//System.out.println(mp);
		
		for (    Entry<String, Integer> keys:  mp.entrySet()) 
		{
			System.out.println( "Key is:" + keys.getKey()+ " " + "Value is:" + keys.getValue());
		}
		 
		 
		 
	}

}
