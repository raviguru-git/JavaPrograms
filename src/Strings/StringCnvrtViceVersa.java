package Strings;

public class StringCnvrtViceVersa {
	public static void main(String[] args) {
		String s1 = "Hello123";
		char [] ch = s1.toCharArray();
		
		for (int i=0; i< ch.length; i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				System.out.println("Entered character is a digit  "+ ch[i]);
			}
			else if(ch[i]>='a' && ch[i] <='z')
			{
				ch[i] -= 32;
			}
			else
			{
				ch[i] += 32;
			}
		}
		String s2 = new String(ch);
		System.out.println(s2);
	}

}
