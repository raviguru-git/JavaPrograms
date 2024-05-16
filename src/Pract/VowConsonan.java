package Pract;

public class VowConsonan {
	public static void main(String[] args) {
		String s = "OneTwoThree123aio";
		int vow=0; int cons=0;
		for (int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u'
			 || ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U')
				{
					vow++;
				}
				else
				{
					cons++;
				}
			}
			
		}
		System.out.println("Count of Vow is:"+ vow);
		System.out.println("Count of cons is:"+ cons);
		
		
	}

}
