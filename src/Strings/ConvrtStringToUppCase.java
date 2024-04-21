package Strings;

public class ConvrtStringToUppCase {
 
	public static void main(String[] args) {
		
		String s = "HelloJava";
		char[] ch = s.toCharArray();
		for (int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a'  && ch[i]<='z')
			{
				ch[i]-= 32;
			}
		}
		String s2 = new String(ch);
		System.out.println(s2);
		
	}
	
}
