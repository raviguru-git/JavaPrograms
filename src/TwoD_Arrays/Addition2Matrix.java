package TwoD_Arrays;

public class Addition2Matrix {
	public static void main(String[] args) {
		int [] [] a = {{1,2,3}, {4,5,6}, {1,2,3}};
		int [] [] b = {{1,2,3},{4,5,6},{3,2,1}};
		int [] [] res = new int [a.length] [a[0].length];  // a.length is for rows and a[0].length for column.
		
		for (int i=0; i<res.length; i++)
		{
			for (int j=0; j<res[i].length;j++) // res[i].length to get the column count.
			{
				res [i][j] = a[i][j] + b[i][j];
				
				
			}
		}
		System.out.println("Elements of Array after Addition are:");
	   for (int i=0; i<res.length;i++)
	   {
		   for (int j=0; j<res[i].length;j++)
		   {
			   System.out.print(res[i][j] + " ");
		   }
		   System.out.println();
	   }
		
	}
	

}
