package CodeSignal;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class LongestString {
	
	public static void main(String[] args) {
		
		String [] arr = { "aba", "aa", "ad", "vcd", "aba"};
		  //String a = arr[0];
		//System.out.println(arr[0]);
		
		
		
		int max_length = 0;
		String longest_string = null; String res="";
		
		/*for (int i = 0; i <arr.length; i++)
		{
			
			System.out.println(arr[i]);
		*/
		List<String> ls = new ArrayList<>();  //?
		//TreeSet<String> ts = new TreeSet<>();
		for ( String s : arr)
		{
			if (s.length() >= max_length)
			{
				max_length = s.length();
				ls.add(s);
				//longest_string = s;
				//res = res  +" " +longest_string;
				//System.out.println(res);
				//ts.add(res);
				//ts.addAll(Arrays.asList(res));  // To Check this output.
				
				//System.out.println(longest_string);
			}
		}
		//System.out.println(res.toCharArray());
		//System.out.println(ts);
		System.out.println(ls);
		
		
	}
	
	
	

}
