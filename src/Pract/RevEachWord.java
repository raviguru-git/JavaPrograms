package Pract;

public class RevEachWord {
	public static void main(String[] args) {
		String s = "One two three";
		String[] arr = s.split(" ");
		String s1 = "";


		for (int i=0; i< arr.length; i++) 
		 { 
			String temp = arr[i]; String rev =""; 
			for (int j=temp.length()-1;j>=0; j--) 
			{ 
				rev = rev + temp.charAt(j);
			}
			s1 = s1 + rev + " ";
		

		} System.out.println(s1);


		for(int i=0; i < arr.length; i++)
		{
			String temp = arr[i]; String rev = "";
			char[] ch = temp.toCharArray();
			for (int j=temp.length()-1;j>=0; j--)
			{
				rev = rev + ch[j];
			}
			s1 = s1 + rev + " ";


		}
		System.out.println(s1);

	}

}
