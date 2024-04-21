package CodeSignal;

public class MatrixElementsSum {
	public static void main(String[] args) {
		int [] [] arr = { {0,1,1,2}, 
						  {0,5,0,0},
						  {2,0,3,3} };
		//System.out.println(arr[0].length);
		//System.out.println(arr.length);
		int cost=0;
		  for(int row =0; row < arr[0].length; row++ )
		  { 
			  for (int col=0; col < arr.length; col++)
			  {
				  if (arr[col][row]== 0)
				  {
					  break;
				  }
				  cost = cost + arr[col][row];
			  }
		  }
		  System.out.println(cost);
		 
	
		
		
		
		
		}
		
		
	}


