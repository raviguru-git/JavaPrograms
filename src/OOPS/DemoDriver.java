package OOPS;

public class DemoDriver {
	public static void main(String[] args) {
		
		Demo d = new Test();  // Storing subclass reference in parent
				              // Type.  Upcasting.
		Test t  = (Test) d;  // Process of converting parent reference
							 // variable to Child type is Downcasting.
		
		d.login();  
		t.logout();
		
		int a = 67;
		char ch = (char) a; // typecasting int to char type.
		System.out.println(ch);
		
	} 
	
	

}
