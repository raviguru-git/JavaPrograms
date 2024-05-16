package Pract;

public class RevWordbyWord {
	public static void main(String[] args) {
		String s = "One Two Three";
		String s1 ="";
		String[] arr = s.split(" "); // Split the array first here.
		
		for (int i=0;i<arr.length;i++)
		{
			String temp = arr[i]; String rev ="";
			char[] ch = temp.toCharArray();
			for (int j=temp.length()-1; j>=0; j--)
			{
				        rev = rev + ch[j];
			}
			   s1 = s1 + rev + " ";
			  
		}
		// OR ****************************** //
		for (int i=0; i< arr.length; i++)
		{
			String temp = arr[i]; String rev= "";
			for (int j=temp.length()-1; j>=0; j-- ) 
			{		// Take temp.length here,// Because each string is in temp now.
				rev = rev + temp.charAt(j);
			}
			   s1 = s1 + rev + " ";
			
		}
		
		 System.out.println(s1);
		
	}

}
