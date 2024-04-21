package Arrays;
import java.util.Scanner;

public class ArrayNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int [] c  = new int [10];
		System.out.println("Enter the array Elements");
		
		
		for (int i=0; i<size; i++)
		{
			c[i] = sc.nextInt();
		}
		System.out.println("Elements of the array are:");
		for (int i=0; i<size; i++)
		{
			System.out.println(c[i]);
		}
	}

}
