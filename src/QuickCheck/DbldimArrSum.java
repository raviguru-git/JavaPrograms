package QuickCheck;

import java.util.Arrays;

public class DbldimArrSum {
	public static void main(String[] args) {
	  int [][] a = {{2,3,4}, {5,6,7}, {8,9,10}};
	  int [][] b = {{2,3,4},{5,6,7},{8,9,10}};
	  int [][] res = new int [a.length] [a[0].length] ;
	  
	  for(int i=0; i<res.length; i++)
	  {   
		  for (int j=0; j<res.length; j++)
		  {
			 res [i][j] = a[i][j] + b[i][j];
		  }
		  
	  }
	  
	  //System.out.println(Arrays.deepToString(res));
	  for (int i=0; i<res.length; i++)
	  {
		  for (int j=0; j<res[i].length; j++)
		  {
			  System.out.print(res[i][j] + "   ");
		  }
		  System.out.println();
	  }
	  
	}

}
