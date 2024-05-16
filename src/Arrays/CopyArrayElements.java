package Arrays;

public class CopyArrayElements {
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,80,100,201};
		int [] res = new int [a.length];
		System.out.println(a.length);
		for (int i =0; i<a.length; i++)
		{
			res[i] = a[i]; // Copying array elements here using 1st array index.
			
		}
		System.out.println("Copied eleements are:");
		for( int i= 0; i<res.length-1; i++)
		{
			System.out.println(res[i]);
		} 
		
	}

}
