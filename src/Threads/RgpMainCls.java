package Threads;

public class RgpMainCls {
	
	public static void main(String[] args) {
		
		
		RgpThread rgp = new RgpThread();
		rgp.start();
		System.out.println("Inside Main thread:");
	}

}
