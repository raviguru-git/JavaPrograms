package QuickCheck;

public class Practice {
	
	public static void main(String[] args) {
		// i/p String -> abc#&*de?!fgh
		// o/p String -> hgf#&*ed?!cba
		
		String s = "abc#&*de?!fgh";
		char [] ch = s.toCharArray();
		
		
		int i = 0;
		int j= s.length()-1;
		
	    while( i < j) {
	    	if(!(Character.isLetter(ch[i])))
	    	{
	    		i++;
	    	}
	    	else if (!(Character.isLetter(ch[j])))
	    	{
	    		j--;
	    	}
	    	else
	    	{
	    		char temp = ch[i];
	    		ch[i] = ch[j];
	    		ch[j] = temp;
	    		i++;
	    		j--;
	    	}
	    
	    	
	    }
	     System.out.println(ch);	
	}

}
