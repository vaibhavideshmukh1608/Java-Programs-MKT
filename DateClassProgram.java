//Assignment 85: WAP to find out the current date, past date and future date using String function

package StringPackage;

import java.util.Date;

public class DateClassProgram {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		System.out.println(d1);
		String format1=d1.toString();
		String month=format1.substring(4, 7);
		System.out.println(month);
		String date=format1.substring(8, 10);
		System.out.println(date);
		String year=format1.substring(format1.length()-4);
		System.out.println(year);
		
		String format2=date.concat(month).concat(year);
		System.out.println(format2);
		
		String format3=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3); //current time
	//Past, future date	
		Date d2=new Date(d1.getTime()+(1000*60*60*24*3));
		System.out.println("Future - "+d2);
		
		Date d3=new Date(d1.getTime()-(1000*60*60*24*2));
		System.out.println("Past - "+d3);
		

	}

}
