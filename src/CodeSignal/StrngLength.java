package CodeSignal;

import java.util.ArrayList;

public class StrngLength {
	public static void main(String[] args) {
		String [] arr = {"RGP", "PLOI", "RAAAVI","SGR","RGRRRR"};
		
		String large = arr[0];
		
		for (int i=0; i< arr.length; i++)
		{
			if (arr[i].length() > large.length())
			{
				large = arr[i];
				
			}
		}
		ArrayList <String> al = new ArrayList<String>();
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i].length() == large.length())
			{
				al.add(arr[i]);
			}
		}
		System.out.println(al);
		
	}

}
