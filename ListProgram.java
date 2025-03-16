package CollectionsPackage;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {
		
		List l1=new ArrayList();
		l1.add("Vaibhavi");
		l1.add(234);
		l1.add('A');
		System.out.println(l1);
		l1.add(0, "Nikita");
		l1.add(3, "Pratik");
		System.out.println(l1);
		l1.remove("Nikita");
		System.out.println(l1);
		
		List l2=new ArrayList();
		l2.add(123);
		l2.add(111);
		l2.addAll(1, l1);
		System.out.println(l2);

	}

}
