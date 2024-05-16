package Pract;

import java.util.ArrayList;

public class AltSumArray {
	public static void main(String[] args) {
		int [] arr = {10,40,50,70,90,20};
		int [] ans =  new int [] {0,0};
		
		boolean goes = true;
		for ( int i=0; i< arr.length; i++)
		{
			if (goes) ans[0] = ans[0] + arr[i];
			else ans[1]=ans[1] + arr[i];
			goes = !goes;
		}
		ArrayList<Integer> al = new ArrayList<>();
		for (int i=0; i< ans.length; i++)
		{
			al.add(ans[i]);
		}
		System.out.println(al);
		
		
		
		
	}

}
