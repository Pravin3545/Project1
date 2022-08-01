package logics_programs;

import java.util.Scanner;

public class concat_int_betwwen_the_string_scanner {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter String:-");

	String s1 = scan.nextLine();
	//System.out.println("Enter String:-");
	//String s1= "sdb554d55D455D598yth7689574444444";
	// boolean a = Character.isDigit(s1.charAt(i));
	// System.out.println(a);
	 int sum=0;
	 for(int i=0; i<=s1.length()-1; i++)
	 {
		 if(Character.isDigit(s1.charAt(i))==true)
		 {
			 sum=sum+Character.getNumericValue(s1.charAt(i));
		 }
	 }
	 

       System.out.println(sum);
}
}
