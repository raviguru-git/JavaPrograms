package OOPS;

public class DemoDriver {
	public static void main(String[] args) {
		
		Demo d = new Test();  // Storing subclass reference in parent
				              // Type.  Upcasting.
		Test t  = (Test) d;  // Process of converting parent reference
							 // variable to Child type is Downcasting.
		
		d.login();  
		t.logout();  // Only when you downcast parent reference
		             // then only you can access child states and behaviours.
		// so it will print logout() method of child class.
		
		int a = 67;
		char ch = (char) a; // typecasting int to char type.
		System.out.println(ch);
		
		int b = 67;
		char c = (char) b;
		System.out.println(c);
		
		
	} 
	
	

}
