package InterviewPrgrams;

public class LandTIntrvw1 {
	// i/p String -> abc#&*de?!fgh
	// o/p String -> hgf#&*ed?!cba

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
		// o/p String -> hgf#&*ed?!cba
		StringBuilder s1 = new StringBuilder();
		
		char [] ch = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		
		while(i<j)
		{
			if(!(Character.isAlphabetic(ch[i]))) // checking for not alphabetic,it just increments 
			{                                    // the i counter or value not changing anything.
				i++;     
			}
			else if (!( Character.isAlphabetic(ch[j])))// checking for not alphabetic,it just decrements 
			{                                          // the j counter or value not changing anything.
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
