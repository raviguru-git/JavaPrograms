package InterviewPrgrams;

import java.util.Arrays;

public class TekPyramid {
	public static void main(String[] args) {
		
		  // input - my name is ravi
      // output -ravi name is my 
		
		String s ="my name is ravi";
		String [] arr = s.split(" ");
		//System.out.println(Arrays.toString(arr));
		int i =0;
		int j = arr.length-1;
		
		
		while(i<j)
		{
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			break;
		
		}
		System.out.println(Arrays.toString(arr));
		
	

}
}
