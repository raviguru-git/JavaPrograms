package NumberSeries;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check for Palindrome");
		int numb = sc.nextInt();
		int rev = 0;
		int temp = numb;
		
		while(numb>0)
		{
			int rem = numb%10;
			rev = rev *10 + rem;
			numb = numb/10;
		}
		
		if(temp == rev)  // compare temp with rev variable here.
			System.out.println("Entered number"+ temp + " Is Palindrome number");
		else
			System.out.println("Entered number" + temp + "  Is nota Palindrome number");
		
		
		
		
	}

}
