package CodeSignal;

public class RotateArrayLeft {
	public static void main(String[] args) {
		
	//	int [] arr = new int [] {1,2,3,4,5} ;
		int [] arr = new int [] {1,2,3,4,5,6,7};
		
		int n =2;
		
		for (int i=0; i<n; i++)
		{
			int first = arr[0],j;
		
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			System.out.println("=======j value ====> " + j);
			arr[j]=first;
			
		}
		
		for (int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
	}
	

}
