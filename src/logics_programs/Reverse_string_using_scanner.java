package logics_programs;

import java.util.Scanner;

public class Reverse_string_using_scanner {
public static void main(String[] args) {
	System.out.println("input string for reverse:-");
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String rev="";
	for (int i=s.length()-1;i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println("The reverse String is:-");
	System.out.println(rev);
	
	
	if (s.equals(rev)) {
		System.out.println("string is pallarodron");
	}
	else {
		System.out.println("string is  NOT pallarodron ");
	}
	

	
}}

