package CodeSignal;

public class StringPractice {
	
	
	public static void main(String[] args) {
		String s1= "MALAYALAM";
		
		try {
			boolean res= checkingPalindrome(s1);
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean checkingPalindrome(String s2)
	{
		return s2.equals(new StringBuilder(s2).reverse().toString());
		
	} 
		
	
	
}
