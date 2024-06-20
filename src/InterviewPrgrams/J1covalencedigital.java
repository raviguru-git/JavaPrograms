package InterviewPrgrams;

import java.util.*;

public class J1covalencedigital {
	
	public static void main(String[] args) {
		//String str = "test123"
		//output-> test
		String s = "test123";
		
		String s1 ="";
		
		for (int i=0; i< s.length(); i++)
		{
		  char ch = s.charAt(i);
		  if ( ch>='a' && ch<='z')
		  {
			   s1 = s1 + ch;
		  }
		}
		System.out.println(s1);
		
		
		
	}
	
	

}
