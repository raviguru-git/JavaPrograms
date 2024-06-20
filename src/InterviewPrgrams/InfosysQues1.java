package InterviewPrgrams;
import java.util.*;

public class InfosysQues1 {
	
	public static void main(String[] args) {
		String text="aabcccacb";
		 char[] ch = text.toCharArray();
		 boolean [] b = new boolean[ch.length];
		 
		 for ( int i=0; i<ch.length; i++)
		 {
			 if (b[i]==false)
			 {    int count = 1;
				 for(int j=i+1; j<ch.length; j++)
				 {
					 if ( ch[i] == ch[j])
					 {
						 count++;
						 b[j] = true;
					 }
				 }
				 System.out.print(ch[i] +""+count);
			 }
		 }
		 
		
		
	}
	


}
