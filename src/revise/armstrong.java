package revise;

import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Given Number:-");
	int s1 = scan.nextInt();
	//int s1=371;
	int sum=0;
	for (int i =s1; i >0; i=i/10) {
		int rem=i%10;
		sum=sum+(rem*rem*rem);
		
		
	}
	if (s1==sum) {
		System.out.println("number is armstrong");
	}
	else {
		System.out.println("not");
	}
}
}
