package patterns;

public class A1A1 {
	public static void main(String[] args) {
		int n=4; char ch='A'; int a =1;
		for(int i=0; i<n; i++)
		{   
			for (int j=0; j<n; j++)
			{
				if(j%2 ==0)
				System.out.print(ch +" ");
				else System.out.print(a+" ");
				//if(j==1) System.out.print(a+" ");
			}
			ch++;
			a++;
			System.out.println();
			

		}


	}

}
