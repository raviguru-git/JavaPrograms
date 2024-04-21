package NumberSeries;
import java.util.Scanner;

public class StrongNumbMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Check for Strong Number");
		int n= sc.nextInt();  
		 String res = isStrongNumb(n);
		 System.out.println(res);
		
	}
		
		public static String isStrongNumb(int n) {
			
			int sum = 0; int temp =n;
			while(n>0)
			{
				int rem = n%10;
				int fact = 1;
				for(int i=1; i<=rem; i++)
				{
					fact = fact * i;
				}
				
				sum = sum + fact;
				n = n/10;			
		}
		if (temp == sum)
			return temp +"Hi";
		else
			return temp + "Bye";
	}
	
	

}

