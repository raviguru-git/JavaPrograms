package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
	public static void main(String[] args) {
		
		int [] a = {25,30,10,50,40,15};
		Arrays.sort(a);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value from 1 to" + a.length);
		int n = s.nextInt();
		System.out.println("The" + n+ "largest element is"+ a[a.length-n]);
		
		
		
	}
	
	
	
	}


