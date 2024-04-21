package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddIntegerElement { 
	public static void main(String[] args) {
		ArrayList al = new ArrayList();  // Creating an ArrayList of non-generic type.
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(100); // Here al will be having all the elements and not their reference as in Arrays. Thats the difference
		// and in ArrayList toString() method is overridden to give all the elements.
		System.out.println(al);
		for (int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Accessing all the elements using Iterator()");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Accessing all the elements using ListIterator");
		 ListIterator list = al.listIterator();
		 
		 while(list.hasNext())
		 {
			 System.out.println(list.next());
		 }
		 System.out.println("Accessing all the elements using ListIterator in Reverse order");
		 while(list.hasPrevious())
		 {
			 System.out.println(list.previous());
		 }
		 System.out.println("Accessing by using for each loop");
		 for( Object l :  al)    // No need of Downcasting here.
		 {
			 System.out.println(l);
		 }
		 
		
		
		
	}

}
