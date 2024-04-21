package Strings;

import java.util.Scanner;

public class SwapStrngWithoutTemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings for Swapping");
		String s1 = sc.next(); // Hello  -  5
		String s2 = sc.next();
		System.out.println("Before swapping");
		System.out.println("s1" + s1);
		System.out.println("s2" + s2);
		// Hi - 2    // HelloHi
		s1 = s1 + s2;  //HelloHi
		
		s2 = s1.substring(0,s1.length()-s2.length()); // 7 - 2 = 5 = Hello 
		//System.out.println("****** s2 " + s2 + "now");
		s1 = s1.substring(s2.length());  //HelloHi - 5 
		//System.out.println("------ s1 " + s1 + "now");
		System.out.println("After Swapping");
	    System.out.println("s1:" + s1 );
	    System.out.println("s2 " + s2);
	    
				
		
		
	}

}
