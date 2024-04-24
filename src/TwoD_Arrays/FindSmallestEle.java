package TwoD_Arrays;

public class FindSmallestEle {
	public static void main(String[] args) {
		int [] [] a = {{10,20,25}, {60,55,5,30}, {100,155,80,200}};
		int small = a[0][0];
		
		for (int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				if(a[i][j]<small) small = a[i][j];
			}
		}
		System.out.println("Smallest Element is:" + small);
		
		
	}

}
