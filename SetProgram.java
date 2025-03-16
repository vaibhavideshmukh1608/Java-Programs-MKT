//Assignment 95: WAP on Set concepts using its methods

package CollectionsPackage;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		
		Set s1=new HashSet();
		s1.add(56);
		s1.add(3);
		s1.add(true);
		s1.add("Vaibhavi");
		s1.add("Vaibhavi");
		s1.add('A');
		
		System.out.println(s1);
		
		System.out.println(s1.isEmpty());
	}

}
