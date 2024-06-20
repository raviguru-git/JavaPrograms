package Intr;

public class Pract1 {
	public static void main(String[] args) {
		String s1 = "abc()defghijabc";
		 char [] ch = s1.toCharArray();
		 boolean [] b = new boolean [ch.length];
		 
		 for (int i=0; i<ch.length; i++)
		 {
			 if (b[i] == false)
			 {   int count=1;
				 for ( int j=i+1 ; j< ch.length; j++) // j= i+1 comparing with immediate next index.
				 {
					 if (ch[i] == ch [j])
					 {
						 count++;
						 b[j] = true;
					 }
				 }
				 System.out.println(ch[i] + "== " + count);
			 }
		 }
		 
	
		
		
		
		}
		 
		 
		 
	}
	


