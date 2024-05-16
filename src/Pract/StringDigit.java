package Pract;

public class StringDigit {
	public static void main(String[] args) {
		String s1 = "Hello1234";
		int count=0;
		for (int i=0; i< s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if (ch >= '0' && ch <='9')
			{
				count++;
			}
			
		}
		System.out.println("count of digits is:" + count);
		
		
	}

}
