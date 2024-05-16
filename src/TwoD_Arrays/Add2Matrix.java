package TwoD_Arrays;

public class Add2Matrix {
  public static void main(String[] args) {
	int [] [] a = {{1,2,3},{4,5,6},{6,7,8}};
	int [] [] b = {{1,2,3},{4,5,6},{6,7,8}};
	int [] [] res = new int [a.length] [a[0].length];
	
	for (int i=0; i<a.length;i++)
	{
		for (int j=0; j<a[i].length;j++)
		{
			res [i][j] = a[i][j] + b [i][j];
		}
	}
	
	for (int i=0; i<a.length; i++)
	{
		for (int j=0; j< a[i].length;j++)
		{
			System.out.print(res[i][j] + "  ");
		}
		System.out.println();
	}
	
	
}
	
}
