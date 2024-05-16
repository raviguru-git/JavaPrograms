package CodeSignal;

public class StringExtract {
	public static void main(String[] args) {
		/*
		 * StringBuffer sb = new StringBuffer(); sb.append("Hello"); sb.append(" ");
		 * sb.append("World"); System.out.println(sb);
		 */
		StringBuffer sb = new StringBuffer();
		
		String input = "Word#$#$% Word 1234";
		String extract = input.replaceAll("[^\\W]+","" ); // \\W is a non-word character.
										 //("[^a-zA-Z]+", "");
	//	input.replaceAll("[^a-zA-Z]+", "")
		
		System.out.println(extract);
		
		String input1 = "Word#$#$% Word 1234";
		char [] ch = input1.toCharArray();
		boolean [] b = new boolean [ch.length];
		
		for(int i=0; i< ch.length; i++)
		{
			  // Setting the flag here.
			if(b[i] == false)
			{   int count=1;
				for(int j=i+1; j< ch.length; j++)
				{
					if(ch[i]== ch[j]){
						count++;
						b[j] = true;
					}
					
					
				}
				System.out.println(ch[i] +"===>"+ count);
			}
			
		}
		
		
		
		
		
	}

}
