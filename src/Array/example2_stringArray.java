package Array;

import java.util.Arrays;

public class example2_stringArray {
public static void main(String[] args) {
	
	//array declearation
	String [] s1=new String[5];
	s1[0]="pravin";
	s1[1]="bodke";
	s1[2]="kk";
	s1[3]="bb";
	s1[4]="aa";

	
	//array initialization
	
	System.out.println(s1[2]);
	System.out.println(s1.length);
	
	System.out.println("print all data from array");
//	for (int i =0; i<=4; i++) 
//	{
//		System.out.print(s1[i]+" ");
//	}
//	
//	for (int i = 0; i <= s1.length-1; i++) {
//		System.out.println(s1[i]);
//	}
//	
	for (int i =s1.length-1;i>=0; i--) {
		System.out.print(s1[i]+" ");
	}
	System.out.println();
	Arrays.sort(s1);
	System.out.println(s1[s1.length-2]);
	
}
}
