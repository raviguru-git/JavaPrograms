package NumberSeries;
import java.util.Scanner;

public class SwapTwoNumbWithTemp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to Swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		System.out.println("Before Swapping");
		System.out.println("a" + a);
		System.out.println("b" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("AFter Swapping");
		System.out.println("a" + a);
		System.out.println("b" + b);
		
		
	}

	

	}
	
	
	


