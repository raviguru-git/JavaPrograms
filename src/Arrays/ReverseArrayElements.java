package Arrays;

public class ReverseArrayElements {
	
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		
		int i =0; // To hold the starting index.
		int j= a.length-1; // To hold the ending index here.
		
		while(i<j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("Elements of the array after reversing:");
		for (int k =0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}
	}
	
	
	


}
