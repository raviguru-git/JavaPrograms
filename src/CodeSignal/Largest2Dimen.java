package CodeSignal;

public class Largest2Dimen {
	public static void main(String[] args) {
		int [] [] arr = {{10,20,30,80},{50,60,800,240,7,5},{4,5,8,900}};
		int large = arr[0][0];
		
		for(int i=0; i<arr.length;i++)
		{
			for (int j=0; j<arr[i].length;j++)
			{
				if (arr[i][j] > large)
				{
					large = arr[i][j];
				}
			}
			
		}
		System.out.println(large); 
		
		
		
		
	}

}
