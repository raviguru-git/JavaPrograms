package CodeSignal;

public class DupStrings {
	public static void main(String[] args) {
		String s ="HHHeeelloWorldSPL@@##$$&&&%%%%%";
		char [] ch= s.toCharArray();
		boolean [] b = new boolean [ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			if(b[i] == false)
			{   int count=1;
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i] == ch[j]) // Getting inside loop and comparing with next item.
					{
						count++;
						b[j]= true;
					} 
					
				}
				if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z'  || ch[i]>='0' && ch[i]<='9')
					// be careful while writing the characters here.
				{
				//if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' )	
					System.out.println(ch[i] + "==>" + count);
				}
				else
				{
					//System.out.println(ch[i] + "===>"+ count);
				}
				
				
			}
			
		}
		
		
	}

}
