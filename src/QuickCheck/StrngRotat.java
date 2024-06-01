package QuickCheck;

import java.util.Arrays;

public class StrngRotat {
	public static void main(String[] args) {
		String  s1 = "HelloWorld";
		String [] s2 = {"Ravi","GURU","RGP"};
		
		//String last = s2[2];int i; 
		int last_index = s2.length-1;
		String last_item = s2[last_index]; int i;
		
		for(i=s2.length-1; i>0; i--)
		{
			s2[i]= s2[i-1];
		}
		s2[i]=last_item;
		System.out.println(Arrays.toString(s2));
	}

}
