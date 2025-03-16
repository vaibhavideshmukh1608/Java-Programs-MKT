package StringPackage;

public class ConstructorsStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("Vaibhavi");
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer(45);
		System.out.println(sb2.capacity());

		//================================================
		
		StringBuilder bb=new StringBuilder();
		System.out.println(bb.capacity());
		
		StringBuilder bb1=new StringBuilder("Cat");
		System.out.println(bb1);
		
		StringBuilder bb2=new StringBuilder(50);
		System.out.println(bb2.capacity());
	}

}
