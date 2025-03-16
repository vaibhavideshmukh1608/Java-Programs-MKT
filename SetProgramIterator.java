//Assignment 96: WAP to iterate a Set using Iterator

package CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgramIterator {

	public static void main(String[] args) {
		
		Set<Double> s1=new HashSet<Double>();
		s1.add(23.4);
		s1.add(40.8);
		s1.add(40.8);
		s1.add(35.9);
		System.out.println(s1);
		
		Iterator I=s1.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}

	}

}
