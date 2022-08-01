package logics_programs;

import java.util.Scanner;

public class Remove_int_from_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Accept any String to remove numbers
		System.out.print("Enter any String to remove numbers:- ");
		String str = scan.nextLine();
		
		// Replace all numbers from given String
		  str = str.replaceAll("[0123456789]", "");
		// Display String without numbers
		System.out.print("String after removing all numbers:- " + str);
		
	}
}
