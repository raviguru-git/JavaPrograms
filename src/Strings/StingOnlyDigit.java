package Strings;

public class StingOnlyDigit {
	public static void main(String[] args) {
		String s2 = "1234AVCCdryII589";
		char [] ch = s2.toCharArray();
		int count=0;
		for (int i=0; i<ch.length; i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				count++;
			}
		}
		if(count==s2.length()) 
		{
			System.out.println("String contains only digit");
		}
		else
			System.out.println("String doesnt contain only digit");
	}

}
