package Pract;

public class LengthOfString {
	public static void main(String[] args) {
		String s1 = "HiHellllloooooHOWareyou";
		char[] arr = s1.toCharArray();
		int count=0;
		for ( char item :  arr)
		{
			count++;
		}
		System.out.println("Length is:" + count);
		
		String s2 = "All the Best for Interview";
		  String[] s = s2.split(" ");
		  System.out.println("Number of words is:" + s.length);
		
		
	}
	

}
