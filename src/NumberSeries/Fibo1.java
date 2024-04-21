package NumberSeries;

public class Fibo1 {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		//System.out.println(a);
		//System.out.println(b);
		
		int sum =0;
		for (int i=1; i<=8; i++)
		{
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			
		}
	}

}
