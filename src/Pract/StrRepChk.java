package Pract;

public class StrRepChk {
	public static void main(String[] args) {
		String s1 = "RAVIGuru$$%%%*";
		char[] ch = s1.toCharArray();
		boolean [] b = new boolean [ch.length];
		
		for (int i=0; i< ch.length; i++)
		{
			if (b[i] == false)
			{
				int count= 1;
				for (int j=i+1; j<ch.length; j++)
				{
					if (ch[i]== ch[j])
					{
						count++;
						b[j] = true;
						
					}
				}
				
				if (count > 1) 
				System.out.println(ch[i]);
			}
		}
		
		
		
		
	}
	

}
