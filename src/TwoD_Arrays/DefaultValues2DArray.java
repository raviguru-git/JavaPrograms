package TwoD_Arrays;

public class DefaultValues2DArray {
	public static void main(String[] args) {
		int [] [] a = new int [3] [4];
		System.out.println(a.length);
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++) // Here it should be j<a[i].length.
											  // No of elements of the row.
			{
				System.out.println(a[i].length);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
