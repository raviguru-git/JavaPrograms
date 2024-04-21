package CodeSignal;

import java.util.ArrayList;

public class NewLongString {
	public static void main(String[] args) {
		String [] arr = { "aba", "aa", "ad", "vcd", "aba" };
		String large = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i].length()>large.length()) large= arr[i];
			
		}
		
		ArrayList<String> al = new ArrayList<>();
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i].length()==large.length())
			{
				al.add(arr[i]);
			}
		}
		System.out.println(al);
		
		
		
	}

}
