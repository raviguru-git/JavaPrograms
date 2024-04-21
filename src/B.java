
public class B { // To print the last digit.
	public static void main(String[] args) {
		int n=1234;
		while(n>0)
		{
			int res = n%10; // To extract the last digit.
		    System.out.println(res);
		    n=n/10;  //To remove the last digit.
		}
		
	}
	

}
