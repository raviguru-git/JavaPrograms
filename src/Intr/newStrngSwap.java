package Intr;

public class newStrngSwap {
	public static void main(String[] args) {
		String s = "abc#&*de?!fgh";
		
		
		
	char []	ch = s.toCharArray();
	
	 int i=0;
	 int j = ch.length-1; 
	 
	 while(i<j)
	 {
		 if (!(Character.isLetter(ch[i])))
		 {
			 i++;
		 }
		 else if(!(Character.isLetter(ch[j])))
		 {
			 j--;
		 }
		 else
		 {
			 char temp = ch[i];
			 ch[i] = ch[j];
			 ch[j] = temp;  // this line was missing actually be careful here.
			 i++; j--;
			 
		 }
	 }
	 
	 System.out.print(new StringBuilder().append(ch).toString());
		
		
	}

}
