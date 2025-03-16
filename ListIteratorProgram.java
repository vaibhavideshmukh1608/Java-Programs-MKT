//Assignment 94:WAP to iterate a List using List iterator

package CollectionsPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		
		List<String> ls=new ArrayList<String>();
		ls.add("Komal");
		ls.add("Virat");
		ls.add("Vaibhavi");
		ls.add(null);
		System.out.println(ls);
		
		ListIterator LI=ls.listIterator();
		
		while (LI.hasNext()) {
			System.out.println(LI.next());
			
		}
		

	}

}
