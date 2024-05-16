package Pract;

public class RevWrdbyWord {
	public static void main(String[] args) {
		
		String s = "All the Best";
		String[] s1 = s.split(" ");
		String s2 = "";
		for(int i=s1.length-1; i>=0 ; i--)
		{
			s2 = s2 + s1[i] + " ";
			
		}
		System.out.println(s2);
		
		
		
		
		
	}

}
