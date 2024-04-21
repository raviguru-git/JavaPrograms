package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Syntax {

	ArrayList al = new ArrayList();
	ArrayList <String> s = new ArrayList();  
	ArrayList <Integer> i = new ArrayList();  // For Generic collection.
	ArrayList <Boolean> al1 = new ArrayList<>();
	
//  HashSet<DataType> h = new HashSet<DataType>();  For Generic collection
	HashSet hs = new HashSet();
	TreeSet ts = new TreeSet();
	
	public static void main(String[] args) {
		ArrayList<String> b = new ArrayList<>();	
		b.add("RAVI");
		//b.remove("RAVI");
		b.add("RAM");
		b.remove(0);
		boolean res = b.contains("RAM");
		
		System.out.println(res);
		String s ="RAJA";
		String res2="";
		
		for (int i= s.length()-1;i>=0; i--)
		{
			res2 = res2 + s.charAt(i);
		}
		System.out.println(res2);
	}
	
	
}
