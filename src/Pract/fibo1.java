package Pract;

public class fibo1 {
	public static void main(String[] args) {
		int a = 0; int sum = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		
		for (int i=1; i<8; i++)
		{
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
			
		}
		
		
	}

}
