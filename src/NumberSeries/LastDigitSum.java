package NumberSeries;

public class LastDigitSum {
public static void main(String[] args) {
	
//	int numb1 = 126;
//	int numb2 = 18;
//	
//	int sum =0 ;
//	
//	numb1 = numb1 %10;
//	numb2 = numb2 %10;
//	sum = numb1 + numb2;
//	System.out.println(sum);
//	
	int numb = 65874;
	int sum =0; int numb1=0; int numb2=0;
	numb = numb%100; 
	numb1 = numb%10; // 4
	numb2 = numb/10; // 7
	sum = numb1 + numb2;
	System.out.println(sum);

	
	
	
}
}
