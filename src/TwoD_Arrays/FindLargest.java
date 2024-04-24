package TwoD_Arrays;

public class FindLargest {
	public static void main(String[] args) {
		int [] [] a = {{10,20,25}, {60,55,30}, {100,155,80,200}};
		int large = a [0][0];
		
		for(int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				if ( a[i][j] > large) large = a[i][j];
				
			}
			}
		System.out.println("Largest Element is:" + large);
		
		
	}

}
