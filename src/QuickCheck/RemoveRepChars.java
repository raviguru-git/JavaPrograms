package QuickCheck;

import java.util.LinkedHashSet;

public class RemoveRepChars {
	public static void main(String[] args) {
		String s2 = "RAAVIRAmbo";
		String res = removDupl(s2);
		System.out.println("Original String:" + s2);
		System.out.println("RemovedDuplicates:" + res);
 	}
	
	public static String removDupl(String input)
	{
		
		if ( input == null || input.isEmpty())
		{
			return input;
		}
			
		//LinkedHashSet maintains order of insertion and removes duplicates.
		
				LinkedHashSet <Character> lh = new LinkedHashSet<>();
				StringBuilder s = new StringBuilder();
				
				for ( char ch : input.toCharArray())
				{
					if (lh.add(ch))
					{
						s.append(ch);
						
					}
				}
				//System.out.println(s.toString());
				return s.toString();
	}

} 
