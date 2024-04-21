package Strings;

public class StringToLowrCase {
	public static void main(String[] args) {
		String s = "HelloABCDEEEEFFFF";
		char [] ch = s.toCharArray();
		for(int i=0; i< ch.length; i++)
		{
			if(ch[i]>='A' && ch[i] <='Z')
			{
				ch[i] += 32;
			}
     	}
		String s2 = new String(ch);
		System.out.println(s2);
	}
}


