package CodeSignal;

public class ArrayEleRpt {
	public static void main(String[] args) {
		//int [] arr = {10,30,50,100,30,20,20,200,200};
		String s1 = "RAVIGURU";
		char [] ch = s1.toCharArray();
		boolean [] b = new boolean[ch.length];
		
		//boolean [] b = new boolean[arr.length];
		
		
		for (int i=0; i<ch.length; i++)
		{
			if (b[i] == false)
			{
				int count=1;
				for (int j=i+1; j<ch.length; j++)
				{
					if (ch[i] == ch[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(ch[i] + "===>" + count);
			}
		}
		
		
		
	}
	
	
	

}
