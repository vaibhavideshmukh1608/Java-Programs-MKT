//Assignment 91: WAP to iterate a Collection using Iterator

package CollectionsPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		c.add(true);
		c.add(40);
		c.add("Vaibhavi");
		System.out.println(c);
		
		Iterator I1=c.iterator();
		while(I1.hasNext()) {
			System.out.println(I1.next());
		}
		
	}

}
