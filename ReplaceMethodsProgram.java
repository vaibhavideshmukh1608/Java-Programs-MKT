//Assignment 84
//WAP on string functions using replace, replaceAll, substring, matches, repeat

package StringPackage;

public class ReplaceMethodsProgram {
	
	public static void main(String[] args) {
		String s1="allan";
		
		boolean m1=s1.matches("(.)*n");
		System.out.println(m1);
		
		boolean m2=s1.matches("a(.)*");
		System.out.println(m2);
		
		String s2="Spmaniderman";
		boolean m3=s2.matches("(.)*man(.)*");
		System.out.println(m3);
		
		String r=s2.repeat(3);
		System.out.println(r);
		
		
	}

}
