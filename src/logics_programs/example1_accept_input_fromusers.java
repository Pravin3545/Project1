package logics_programs;

import java.util.Scanner;

public class example1_accept_input_fromusers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Num1:");
		int num1 = scan.nextInt();

		
		System.out.println(num1);		



		System.out.print("Enter Num2:");
		int num2 = scan.nextInt();
		
		System.out.println(num1+num2);
	}
	
	
}


