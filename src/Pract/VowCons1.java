package Pract;

public class VowCons1 {
	public static void main(String[] args) {
		String s1 = "OneTwo";
		int vow=0; int cons=0;
		for (int i=0; i<= s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				if (ch=='a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u'
					|| ch=='A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U')
				{
					vow++;
				}
				else
				{
					cons++;
				}
			}
			
			
		}
		System.out.println("Count of vow:" + vow);
		System.out.println("Count of cons:" + cons);
		
		
		
	}

}
