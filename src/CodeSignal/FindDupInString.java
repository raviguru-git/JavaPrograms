package CodeSignal;

public class FindDupInString {
	public static void main(String[] args) {
		int [] a = {10,20,40,50,70,100,100};
		boolean [] b = new boolean [a.length];
		for (int i=0; i<a.length; i++)
		{
			if(b[i]==false)
			{   int count=1; //Count should be one here, **VVIP.
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]== a[j])
					{
						count ++;
						b[j]=true;  // If an item is same then set b flag to true;
					}
				}
				if(count==1)
				//System.out.println("Duplicate element is " + a[i] );
				System.out.println("Unique elements is:"+ a[i]);
			}
		}
		
		
	}

}
