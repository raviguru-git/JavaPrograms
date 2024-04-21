package Arrays;

public class FrequencyOfElemnt {
	
	public static void main(String[] args) {
		int [] a = {10,20,30,40,500,20,10,30,900,900};
		boolean [] b = new boolean [a.length];
		
		for ( int i=0; i<a.length; i++)
		{
			if (b[i]== false)
			{
				int count=1;
				for(int j=i+1; j<a.length; j++)
				{
					if (a[i] == a[j])
					{
						count++;
						b[j] = true;  // Setting the flag to true for boolean array.
					}
				}
				System.out.println(a[i]+"======>"+count);
			}
		}
		
		
	}

}
