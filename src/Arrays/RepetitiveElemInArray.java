package Arrays;

public class RepetitiveElemInArray {
	public static void main(String[] args) {

		int [] a = {10,20,30,500,90,20,10,30};
		boolean [] b = new boolean [a.length];

		for (int i=0; i<a.length; i++)
		{
			if (b[i]== false)
			{int count=1;
			for(int j =i+1; j<a.length; j++)
			{
				if (a[i] == a[j]) // ask query here, what happens for = operator here. 
				{
					count++;
					b[j] = true;
				}
			}
			if(count>1)
			{
				System.out.println("Repetitive elements found in Array are:"+a[i]+" And Count is===>"+count);
			}
			}
		}
	}


}
