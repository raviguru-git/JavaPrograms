package Strings;

public class StringUniqueChars {
	public static void main(String[] args) {
		String s = "HEHLLO@1234";
		char [] ch = s.toCharArray(); // Converting String to Char Array.
		boolean [] b = new boolean [ch.length];  // Declare one boolean array to mark the result True or False.
		
		for (int i =0; i< ch.length; i++)
		{
			if(b[i] == false)
			{   int count=1;
				for (int j= i+1; j<ch.length; j++)  // For fetching one character individual to compare.
				{
					if (ch[i] == ch[j])  // Comparing 1st Index with next index character here.
					{
						count++;
						b[j] = true;
					}
				}
				if(count == 1)
					System.out.println("Unique characters are:" + ch[i]);
			}
		}
		
	}

}
