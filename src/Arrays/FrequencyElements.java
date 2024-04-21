package Arrays;

public class FrequencyElements {
	public static void main(String[] args) {
		int [] a = {10,20,30,10,20,100,10,30,50};
	    boolean [] b = new boolean[a.length];
		
		for (int i=0; i<a.length; i++)  // To get one element here.
		{
			if (b[i] == false)
			{   int count = 1;
				for (int j = i+1; j<a.length; j++) // To compare each element here.
				{
					if( a[i] == a[j])
					{
						count ++;
						b[j] = true;
					}
					
				}
				System.out.println(a[i] +"==>" + count);
			}
			
		}
		
	}

}
