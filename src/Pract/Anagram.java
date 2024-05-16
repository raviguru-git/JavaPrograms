package Pract;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string for check");
		String s1 = sc.nextLine();
		System.out.println("Enter second string for check");
		String s2 = sc.nextLine();
		s1 = s1.toLowerCase();
		char[] ch1 = s1.toCharArray();
		s2 = s2.toLowerCase();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res = Arrays.equals(ch1, ch2);
		if (res) System.out.println("String given is Anagram");
		else System.out.println("String is not Anagram");
	}

}
