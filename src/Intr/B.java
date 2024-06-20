package Intr;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {

	// i/p -> abc#&*de?!fgh
	// o/p -> hgf#&*ed?!cba

	public static void main(String[] args) {
	
	/*StringBuilder s2 = new StringBuilder();
	
	
	 * String regex = "[a-zA-Z]+";
	 * 
	 * Pattern p = Pattern.compile(regex); Matcher m = p.matcher(regex);
	 * while(m.find()) { String text = m.group(); }
	 
	
	for (int i=s.length()-1 ; i>=0 ; i--)
	{
		
		char ch =  s.charAt(i); 
		
		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
		{
			System.out.print(ch);
						
			
			 * if (ch=='!' || ch=='?' || ch=='*' || ch =='&' || ch=='#') {
			 * 
			 * continue; }
			 
			 
			 
		}
		
		  else { ;
		  
		  }
		 
	}
	
	
}*/
	
	String s = "abc#&*de?!fgh";
	StringBuilder s1 = new StringBuilder();
	
	char [] ch = s.toCharArray();
	int i = 0;
	int j = s.length()-1;
	
	while(i<j)
	{
		if(!(Character.isAlphabetic(ch[i])))
		{
			i++;
		}
		else if (!( Character.isAlphabetic(ch[j])))
		{
			j--;
		}
		else 
		{
			char temp  = ch[i];
			ch[i] = ch [j];
			ch[j] = temp;
			i++;  // condition was missing here for swapping.
			j--;  // condition was missing here for swapping.
		}
		
	}
	System.out.println(s1.append(ch).toString());
	
	
	

}
}

