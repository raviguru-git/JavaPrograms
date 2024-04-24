package TwoD_Arrays;

import java.util.Scanner;

public class ReadRowColSize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		System.out.println("Enter the col size");
		int col= sc.nextInt();
		int [] [] a = new int [row] [col];
		System.out.println("Enter" + row * col+" elements");
		for (int i=0; i< a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				a[i] [j] = sc.nextInt();
			}
		}
	   for(int i=0; i<a.length; i++)
	   {
		   for(int j=0; j<a[i].length;j++)
		   {
			   System.out.print(a[i][j] + " ");
		   }
		   System.out.println();
	   }
		
	}

}
