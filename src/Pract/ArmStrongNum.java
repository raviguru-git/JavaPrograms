package Pract;

public class ArmStrongNum {
	public static void main(String[] args) {
		int num = 370; int temp = num;
		int count = 0; int sum = 0; int temp1 = num;
		while (num > 0)  // 1st program, get the count of the digit.
		{
			count++;
			num = num/10;
		}
		System.out.println(count);
		while(temp>0)   // 2nd program.
		{
			int rem = temp % 10; // Extract last digit.
			int prod = 1; 
			for ( int i = 0; i< count; i++)
			{
				prod = prod * rem;  // Get the product and multiply it 3 times.
			}
			sum = sum + prod;  // Make sum of the product with each individual number.
			temp = temp / 10;  
		
		}
		// Compare the original number with sum for Armstrong.
		if (temp1 == sum ) System.out.println("Number is Armstrong number");
		else System.out.println("Number is not a Armstrong number");
		
		
		
		
		
		
	}

}
