package TwoD_Arrays;

public class Default2DArray {
	public static void main(String[] args) {
		int [] [] a = new int [3] [4];
		System.out.println(a);  // Prints the address of the 2D-Array.
		System.out.println(a[0]); // Address of first row.
		System.out.println(a[1]); // Address of second row.
		System.out.println(a[2]); // Address of third row.
		System.out.println(a[0].length); // Total element in first row.
		System.out.println(a[1].length); // Total element in second row.
		System.out.println(a[2].length); // Total element in third row.
	}
	
	

}
