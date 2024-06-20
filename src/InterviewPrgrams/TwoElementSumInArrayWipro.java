package InterviewPrgrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TwoElementSumInArrayWipro {
	public static void main(String[] args) {
		int [] arr = {7, 3, 6, 8, 2, 4, 1, 21};
		// sum =10;
		// (3,7) (8,2)  (6,4) 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sum value or number:");
		int prod = sc.nextInt();
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == prod) 
					
					System.out.print("("+arr[i] + "," + arr[j] +  ")"+"   ");
//Mistake done.				System.out.println(arr[i][j]);
				
				   
			}
		}
		
		
		
		
	}

}

