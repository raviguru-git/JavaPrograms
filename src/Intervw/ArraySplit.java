package Intervw;

import java.util.Arrays;

public class ArraySplit {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7};
		int midpoint = a.length/2; // 3
		//int [] first_arr = new int [midpoint-1];
		//int [] second_arr = new int[a.length-1-midpoint];
		
		int i = 0;
		int j = midpoint-1;
		while(i<j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		int k_start=a.length-midpoint; // 4
		int m_end = a.length-1; // 6
		while(k_start < m_end)
		{
			int temp = a[k_start];
			a[k_start] = a[m_end];
			a[m_end] = temp;
			k_start++;
			m_end--;
		}
		System.out.println(Arrays.toString(a));
		
		
	}
	

}
