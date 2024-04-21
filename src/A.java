import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter physics number");
		int p = sc.nextInt();
		System.out.println("Enter chemistry number");
		int c = sc.nextInt();
		System.out.println("Enter maths number");
		int m = sc.nextInt();
		System.out.println("Enter biology number");
		int b = sc.nextInt();
		if (p>= 35 && c >= 35 && m >= 35 && b >= 35)
		
	    {
			int sum= p+c+m+b;
			int per = sum/4;
			
			if(per>=85)
			{
			System.out.println("Passed with distinction");
			}
			else if(per>=75)
			{
				System.out.println("Passed with First Class");
			}
			else if(per>=60)
			{
				System.out.println("Passed with Second Class");
			}
			else
			{
				System.out.println("Just Passed");
			}
	    }
		else
		{
			System.out.println("Student is failed");
			
	    }
	}
		
	}

