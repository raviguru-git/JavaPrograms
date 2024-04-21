package Strings;

public class CountVowConsnt {
	public static void main(String[] args) {
		
		String s = "OneTwoThree123aio";
		int vowel=0; int conso=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u' ||
				   ch=='A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U')	
				{
					vowel++;
					
				}
				else
				{
					conso++;
				}
				
			}
		}
		System.out.println("Count of Vowel  " + vowel);
		System.out.println("Count of Consonant " + conso);
		
		
	}
	
	

}
