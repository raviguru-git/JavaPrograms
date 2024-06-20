package QuickCheck;

public class DuplArryElem {
	public static void main(String[] args) {
		  
	      int [] arr = {10,20,30,40,30,30,30};
	      boolean [] b = new boolean[arr.length];
	      
	      for (int i=0; i< arr.length; i++)
	      {
	        if (b[i] == false)
	        {
	          int count=1;
	          for ( int j=i+1; j< arr.length; j++)
	          {
	            if ( arr[i] == arr [j])
	            {
	              count++;
	              b[j] = true;  // You need to set b[j] to true here, else problem.
	            }
	          }
	         if(count == 1)
	        System.out.println(arr[i] + " " + count);
	         // And while printing o/p be careful you have to concatenate with arr[i] and count
	         // Else it will both of them and give the count here.
	        }
	      }
		
	}

}
