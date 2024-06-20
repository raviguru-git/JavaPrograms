package InterviewPrgrams;

import java.util.ArrayList;
import java.util.HashSet;

public class J2covalencedigital {
	public static void main(String[] args) {
	// Arraylist 
	//can you create one arraylist , assign some values and remove the duplicates from it
				
				ArrayList<Integer> al = new ArrayList<>();
				al.add(10);
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(20);
				al.add(30);
				System.out.println(al);
				
				HashSet<Integer> hs = new HashSet<>(al);
				
				for ( Integer number : hs)
				{
					hs.add(number);
				}
				System.out.println(hs);
				
				//Given below what is the o/p.
		        String s1 = "java";
				String s2 =new String("java");
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s1.equals(s2)); // true
				System.out.println(s1==s2); //false
				
				
			}
			
			
		}

		/*
		 * JSONObject js = new JSONObject(Response_Code); js.hasKey();
		 * 
		 * js.
		 */
		
	


