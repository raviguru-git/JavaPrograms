package CodeSignal;

public class AltSumArray {
	public static void main(String[] args) {
		int [] arr = {40,80,90,200,40};
		
		// Create another array to hold 2 teams data.
		int [] ans = new int [] {0, 0};
		
		boolean goes = true;
		for( int person : arr)
		{
			
			if(goes)  ans[0] = ans[0] + person;
			else ans[1] = ans[1] + person;
			goes = !goes;  // Is this toggling here? 
		}
		
		for (int i=0; i<ans.length; i++)
		{
			System.out.println(ans[i]);
		}
		
		
		
		
	}
	

}
