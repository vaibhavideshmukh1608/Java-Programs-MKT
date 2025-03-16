//Assignment 93: WAP to iterate a List using Iterator

package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProgramIterator {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(20);
		l1.add(12);
		l1.add(40);
		l1.add(5);
		System.out.println(l1);
		
		Iterator I1=l1.iterator();
		while(I1.hasNext()) {
			System.out.println(I1.next());
		}

	}

}
