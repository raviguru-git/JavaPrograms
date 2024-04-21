package CodeSignal;

import java.util.ArrayList;

public class LargePract1 {
	public static void main(String[] args) {
		String [] arr = { "aba", "aa", "ad", "vcd", "aba","ABDC", "ABCD" };
		String large = arr[0];  // assuming first index is large here.
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i].length()>large.length()) large = arr[i]; // fetch one one element from array and
			//check for its length with large item length.
		}
		System.out.println(large);
		
		ArrayList<String> al = new ArrayList<>();
		
		for (int i=0; i < arr.length; i++)
		{   // Comparing each elements length with large items length.
			if ( arr[i].length() == large.length())  al.add(arr[i]);
		}
		System.out.println(al);
		
	
	}

}
