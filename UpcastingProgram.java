/*
 * Assignment 89 : WAP on collection concept with the help of Upcasting on Different 
 * Data types (Int, Char, Double, string etc.) with different methods 
 * like Add, Remove, Contains.
 */

package CollectionsPackage;

import java.util.ArrayList;
import java.util.Collection;

public class UpcastingProgram {
	
	public void test() {
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		
		Collection c=new ArrayList();	
		c.add("Vaibhavi");
		c.add(true);
		c.add('A');
		c.add(12345);
		c.add(20.34345);
		System.out.println(c);
		Collection copy=new ArrayList();
		copy.addAll(c);
		System.out.println(copy);
		System.out.println(c.contains('A'));
		System.out.println(c.contains('B'));
		
		System.out.println(c.containsAll(copy));
		
		System.out.println("Equals Result - "+c.equals(copy));
		
		Collection<String> c1=new ArrayList<String>();
		c1.add("Vaibhavi");
		c1.add("Ram");
		System.out.println(c1);
//		Collection<String> copy2=new ArrayList<String>();
//		copy2.addAll(c);
//		System.out.println(copy2);
		
		
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(23);
		c2.add(40);
		System.out.println(c2);
		
		System.out.println(c2.contains(40));
		System.out.println(c2.containsAll(c1));
		
		
		
		Collection<Character> c3=new ArrayList<Character>();
		c3.add('D');
		c3.add('V');
		c3.add('P');
		System.out.println(c3);
		c3.remove('V');
		System.out.println(c3);
		
		

		Collection<Double> c4=new ArrayList<Double>();
		c4.add(23.555);
		c4.add(2.3);
		System.out.println(c4);
		c4.clear();
		System.out.println(c4);

	}

}

