package Strings;

public class RemoveSpaceString {
	public static void main(String[] args) {
		String s = "One Two Three";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if( ch != ' ')
			{
				s1 = s1 + ch;
			}
		}
		System.out.println(s1);

	}

}
