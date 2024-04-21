package CodeSignal;

import java.util.ArrayList;

public class LongString {
	public static void main(String[] args) {
		String [] arr = { "aba", "aa", "ad", "vcd", "aba" };
		
		String longest_string = null; String res = "";
		int max_length =0;
		
		ArrayList<String> al = new ArrayList<String>();
		
		for( String item :  arr)
		{
			if( item.length() > max_length )
			{
				max_length = item.length();
				al.add(item);
				longest_string = item;
				res = res +" "+longest_string;
				
							
			}
		}
		
		
		
	}

}
