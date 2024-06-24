package Threads;

public class RgpThread extends Thread {
	
	public void run()
	{
		System.out.println("Inside run method:");
		System.out.println(add(20,30));;
	}
	
	public int add(int a, int b)
	{
		return a + b;
	}
	
	

}
