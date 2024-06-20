package Intr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevrseCharacr {
public static void main(String[] args) {
	String s = "abc#&*de?!fgh";
	char [] ch = s.toCharArray();
	
	List<Character> l = new ArrayList<>();
	
	for (  char letter:  ch )
	{
		if (Character.isLetter(letter))
		{	
			l.add(letter);
		}
	}
	System.out.println(l);
	Collections.reverse(l);
	System.out.println("After reverse" + l);
	StringBuilder s1 = new StringBuilder();
	
	for (  char letter :  ch)
	{ System.out.println("In Second loop==>" + letter);
		if ( Character.isLetter(letter))
		{
			s1.append(l.remove(0));  // removing item from the list and appending to s1 StringBuilder.
			System.out.println("List after removing first index" + l);
			//System.out.println(s1);
		}
		else 
		{
			s1.append(letter);
		}
	}
	
	System.out.println(s1);
}

}
