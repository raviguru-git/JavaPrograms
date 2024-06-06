package CodeSignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class check {
	 public static void main(String[] args) {
		
		 String s = "RaviG2024.^*&)";
		 System.out.println(s.length());
		 
		 StringBuilder letters = new StringBuilder();
		 StringBuilder digits = new StringBuilder();
		 StringBuilder spl_charac = new StringBuilder();
		 
		 
		 for (int i=0; i<s.length(); i++)
		 {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <='z' || ch >='A' && ch <='Z')
			{
				letters.append(ch);
			}
			
			else if (ch >= '0' && ch <='9')
			{
				digits.append(ch);
			}
			else
			{
				spl_charac.append(ch);
			}
		 }
		 System.out.println(letters.toString());
		 System.out.println(digits.toString());
		 System.out.println(spl_charac.toString());
		 
	}
	
	
	
	

	}	
	
	



	

