package Pract;

public class PalinNum {
	public static void main(String[] args) {
     int n = 1441;
     int rev = 0;
     int temp = n;
     
     while(n>0)
     {
    	 int rem = n % 10;
    	 rev = rev * 10 + rem;
    	 n = n/10;     
     }
     if ( temp == rev) System.out.println(temp + " is a palindrome number");
     else System.out.println(temp + " is not a palindrome number");
		
		
	}

}
