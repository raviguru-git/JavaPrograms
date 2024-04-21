package CodeSignal;
import java.util.Scanner;

public class CodeSignal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = centuryFromYear(1700);
		System.out.println(res);
		
		//System.out.println(checkPalindrome("MALAYALAM"));
		System.out.println(chkPalindrome("RACECAR"));
		
		System.out.println(shapeArea(4));
		
		
	}
	
	public static int centuryFromYear(int year)
	{
		/* This formula rounds upto nearest century.
		 * 
		 * @input :
		 * @output: int century
		* 
		* output : century -> int.
		*int century 
		*/
		return  (year -1) / 100 + 1 ;
		
	}
	
	public static boolean checkPalindrome(String inputString)
	{
		//String s ="RAVI";
		//char [] ch = inputString.toCharArray();
		String res = "";
		
		for (int i=inputString.length()-1; i>=0; i--)
		{
			res = res + inputString.charAt(i);
		}
		if(inputString.equals(res))  // Here don't give == comparatore for String comparisons. it will try to compare the address here.
		return true;
		else
			return false;
		
		
	}
	
	public static boolean chkPalindrome(String s3)
	{
		//StringBuilder sb = new StringBuilder(s3);
		return s3.equals( new StringBuilder(s3).reverse().toString());
		//return s3.equals(new StringBuilder(s3).reverse().toString());
		
	}
	
	public static int shapeArea(int n)
	{
		return (int) (Math.pow(n-1, 2) + Math.pow(n, 2));
		
	}
	
}


