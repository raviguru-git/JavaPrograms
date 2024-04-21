package Arrays;

public class MergeArray {
	public static void main(String[] args) {
		
	
	int [] a = {10,30,300,400,700,800};
	int [] b = {50,80,50,900};
	int [] res = merge(a, b);
	for(int i=0; i< res.length; i++)
	{
		System.out.println(res[i]);
	}

}
	public static int[] merge(int[] a, int [] b)
	{
		
		int [] res = new int [a.length + b.length]; 
		
		for (int i=0; i<a.length; i++) // For getting contents from a [] to res [].
		{
			res[i] = a[i];
		}
		for (int i=0; i<b.length; i++) // For getting contents from b[] to res [].
		{
			res[a.length+i] = b[i];
		}
		return res;
	}

}