package Pract;

public class SqureRoot {
	public static void main(String[] args) {
		int n = 9;
		
		int i = 1; int count = 0;
		for( ;i<n/2 ; i++)
		{
			if ( i * i == n) { count++; break;}
		}
		
		if ( count == 1 ) System.out.println(i + " is the square root of " + n);
		else System.out.println(i + " is not the square root of " + n);
		
		

	}
}
