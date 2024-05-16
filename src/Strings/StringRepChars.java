package Strings;

public class StringRepChars {
	public static void main(String[] args) {
		String s = "RAVIGURUU$$$$U";
		char [] ch = s.toCharArray();
		boolean [] b = new boolean [ch.length];
		
		for (int i=0; i<ch.length; i++)
		{
			if(b[i] ==false)
			 {
				int count=1;
				for (int j=i+1; j<ch.length; j++)  // Dont give j <= ch.length here it will throw AIOBE.
				
				{
					if (ch[i] == ch[j])  // If ch[i] == ch [j];
					{
						count++;
						b[j] = true;
					}
					 
				}
				System.out.println(ch[i] +"==>" + count);
			}
		}	
	}
}
