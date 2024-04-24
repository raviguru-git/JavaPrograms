package TwoD_Arrays;

public class SumOf2DArrays {
	public static void main(String[] args) {
		int [] [] a = {{10,20,25}, {60,55,5,15}, {10,20,25}};
		int sum =0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length;j++)
			{
				sum+= a[i][j];
			}
			
		}
		System.out.println("Sum of the Array is:"+ sum);
	}

}
