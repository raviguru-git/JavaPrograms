package QuickCheck;

import java.util.Arrays;

public class StrChrRotate {
	public static void main(String[] args) {
		String s1 = "Hanumanji";
		char[]	ch = s1.toCharArray();
		
		

		int n=2;
		for(int j=0; j<n; j++)
		{
			char last = ch[ch.length-1]; int i;
			for (i=ch.length-1;i>0;i--)
			{
				ch[i] = ch[i-1];
			}
			ch[i]=last;
			System.out.println(Arrays.toString(ch));
			String s2 = new String(ch);
			System.out.println(s2);
		}


	}

}
