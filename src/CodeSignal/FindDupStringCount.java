package CodeSignal;

public class FindDupStringCount {
	public static void main(String[] args) {
		String s ="RemoveSpecial&*(())^&&&&RAVI";
		char[] ch = s.toCharArray();
		boolean [] b = new boolean [ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			if(b[i]==false)
			{   int count=1;
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i]==ch[j])
					{
						count++; 
						b[j]= true;
					}
					
				}
				if(ch[i]>='a' && ch[i]<='z' || ch[i]>='0'&& ch[i]<='9' || ch[i]>='A' && ch[i]<='Z' )
				{
			//	System.out.println("Element " +ch[i]+ "==>" + count);
				}
				else
				{
				  System.out.println(ch[i] + " count is: ==>"+count);
				}
			}
			 
		}
		
		
	}

}
