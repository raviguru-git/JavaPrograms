package Strings;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate {
	public static void main(String[] args) {
		String[]  arr = {"Java", "Python", "Cobol", "Perl", "Android"};
		String[]  arr2 = {"Java", "Python", "Fortran", "Perl", "Android"};
		Integer[] arr3 = {1,10,20,30};
		/*
		 * The Arrays.asList() method is a built-in method in Java 
		 * that converts an array into a List. 
		 * This method takes an array as an argument and returns a List object.
		 */
		//List<String> mylist2 = Arrays.asList(arr2);
		
		List<Integer> mylist3 = Arrays.asList(arr3);
		
	 ///Collections.rotate(mylist2, 4);
	 //System.out.println(mylist2);
		Collections.rotate(mylist3, 0);
	 
		
		
		//List<String> mylist = Arrays.asList(arr); //
		//call the Arrays.asList() method and pass the array as an argument. 
		//This will return a List object containing the elements of the array.
		
		
		System.out.println("Before rotating *********:" + mylist3);
		//Collections.rotate(arr, 3);
		System.out.println("After rotating *********:");
		Collections.rotate(mylist3, -3 );
		
		
		System.out.println(mylist3);
		
	}

}
