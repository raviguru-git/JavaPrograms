package CodeSignal;

import java.util.ArrayList;
// By Arpitha Madam
public class LongestStringArpMm {
public static void main(String[] args) {
	String [] arr = { "aba", "aa", "ad", "vcd", "aba" };
	//String [] arr = { "abad", "aa", "ad", "vcd", "aba","abcd","abcde","abcee"};
	String large=arr[0];  // Assuming this 0th index as largest here.
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].length()>large.length())
		{
			large=arr[i];
		}
		 
	}
	System.out.println(large);//abcd   4
	ArrayList<String> al=new ArrayList<>();
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].length()==large.length())
		{
			al.add(arr[i]);
		}
	}
	System.out.println(al);
}
}
