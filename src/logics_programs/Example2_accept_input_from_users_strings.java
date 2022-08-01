package logics_programs;

import java.util.Scanner;

public class Example2_accept_input_from_users_strings {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("String name:");
	String name = scan.next();
	
	int s1 = name.indexOf("i");
	System.out.println(s1);
	System.out.println(name);
}
}
