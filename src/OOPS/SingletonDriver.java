package OOPS;

public class SingletonDriver {
	
	public static void main(String[] args) {
		
		 Singleton s1 = Singleton.getInstance();
		 Singleton s2 = Singleton.getInstance();
		 
		 if (s1 == s2) System.out.println("Both objects are same");
		 else System.out.println("Both objects are not same");
		
	}
	
	

}
