package NumberSeries;

public class ArmstrongNumbr {
	public static void main(String[] args) {
		int num = 8208;
		int count = 0;
		int temp = num;
		int temp1 = num;
		int sum = 0;
		while(num>0) // Getting the count of the digits here.
		{
			count ++;
			num = num /10;
		}
		
		while(temp>0) // Getting the product or multiplying number that many times here.
		{   int rem = temp %10;
			int prod = 1;
			for (int i=0 ; i<count;i++)
			{
				prod = prod * rem;
			}
			sum = sum + prod;  // Summing the product here.
			temp = temp/10;
		}
		
		if (temp1 == sum)
			System.out.println("The given number is:" + temp1 + "Armstrong Number");
		else
			System.out.println("The given number is:" + temp1 + "Not an Armstrong number");
	}

}
