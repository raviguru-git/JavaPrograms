package CodeSignal;

public class AlternateElementArrSum {
	
	public static void main(String[] args) {
		int [] a = {50,60,60,45,70};
		/*int sum = 0;
		for(int i=0; i<a.length-1; i++)
		{
			sum += a[i] + a[i+2];
		}
		
		System.out.println(sum);
	}*/
		
		int [] ans = new int [] {0,0};
		
		boolean goes = true;
		for( int person :  a)
		{
			if(goes) 
			{
				ans[0] = ans[0] + person;
			}
			else
				ans[1] = ans[1] + person ;
			goes = !goes; // Check this if you put as !goes. then o/p changes here.
		}
		
		for (int i=0; i < ans.length; i++)
		{
			System.out.println(ans[i]);
		}
	
}
}
