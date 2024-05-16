package OOPS;

public class AmazonDriver {
	
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.login();
		a.logout();
		Inter a1 = new Amazon();
		a1.login();
		System.out.println(a1.a);
		
		
	}

}
