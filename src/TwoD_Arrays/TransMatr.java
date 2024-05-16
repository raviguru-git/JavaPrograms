package TwoD_Arrays;

public class TransMatr {
public static void main(String[] args) {
	int [] [] arr = {{2,3,4}, {5,6,7}};
	int [] [] res = new int [arr[0].length][arr.length];
	
	for (int i=0; i<res.length; i++)
	{
		for (int j=0; j<res[i].length; j++)
		{
			res [i] [j] = arr [j][i];
		}
	}
	
	for (int i=0; i<res.length; i++)
	{
		for (int j=0; j<res[i].length; j++)
		{
			System.out.print(res[i][j] + "  ");
		}
		System.out.println();
	}
	
}
	
}
