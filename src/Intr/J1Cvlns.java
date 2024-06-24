package Intr;
import java.util.*;
public class J1Cvlns {
	public static void main(String[] args) {
		// input = mom.
		
		String s = "dad";
		String rev= "";
		for ( int i=s.length()-1; i>=0; i--)
		{
			rev =  rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if( s.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is a palindrome");
		} 
		else
		{
			System.out.println("Given string is not a palindrome");
		}
		
		
	}
	
	
	
	
	
}
