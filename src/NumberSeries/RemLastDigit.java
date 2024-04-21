package NumberSeries;
import java.util.Scanner;

public class RemLastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int res = n%10;
		System.out.println(res);
		
		
	}

}
