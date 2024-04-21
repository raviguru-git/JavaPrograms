package CodeSignal;

public class AltSumArrayy {

	public static void main(String[] args) {

		int [] a1 = {20,30,40,50,90,100};

		// Create an another array to hold only 2 values i.e 2 size and 
		// 2 teams are there.

		int [] ans = new int [] {0,0};

		boolean turns = true;

		for ( int person :   a1)
		{
			if(turns) ans[0] +=  person;
			else ans[1] += person;
			turns = !turns;  // Flipping each time using not or Toggling the Values here.

		}
		
		for (int i=0; i< ans.length; i++)
		{
			System.out.println(ans[i]);
		}




	}


}
