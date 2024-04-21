package NumberSeries;

public class Fibonacci {
	public static void main(String[] args) {
		int a =0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		int sum =0;
		while(sum<21)
		{
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
		
		
		
		
		
		
	}

}
