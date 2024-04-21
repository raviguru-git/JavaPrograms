package NumberSeries;

public class SumoFDigits {
	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		while(n>0)
		{
			int res = n%10;
			sum = sum + res;
			n = n/10;
		}
		System.out.println(sum);
	}

}
