package QuickCheck;

public class StngCheck {
	public static void main(String[] args) {
		
		String s2 ="My name is Ravi";
		String[] s3 = s2.split(" "); String s1="";
		
		 for (int i=0; i<s3.length; i++)
		 {
			 String temp = s3[i]; String rev = "";
			 for (int j=temp.length()-1;j>=0; j--)
			 {
				rev = rev + temp.charAt(j);
			 }
			   s1 = s1 + rev + " ";
			   
		 }
		 System.out.println(s1);
}
}
	
