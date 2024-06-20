package Threads;

public class MyThread extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
		System.out.println(addNum(10, 2));
	}
	
	public static int addNum(int a, int b)
	{
		return a + b;
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("Main thread is running");
	}

}
