package Array;

import java.util.Arrays;

public class Stringarray_decleration_intialization_insinglestep {
public static void main(String[] args) {
	
	String[]ar= {"pravin","bodke","jamgoan","krushana"};
	
	System.out.println(ar.length);
	
	System.out.println(ar[3]);
	
	System.out.println("---------------print all data-----------------------------------");
	Arrays.sort(ar);
	for (int i= 0; i<=ar.length-1; i++) {
		System.out.println(ar[i]);
	}
	System.out.println("--------------------------------print all data in reverse order----------------------------------------------------------------");
//	
//	for (int i = ar.length-1;i>=0; i--) {
//		System.out.println(ar[i]);
//	}
//	
	
	System.out.println("print data in desending order");
	
	
	for (int i = 0; i <= ar.length-1; i++) {
		System.out.println(ar[i]);
	}
	
	
	System.out.println("--------------------------------------------------------------------------");
	System.out.println("print all data in ascending order");
	for (int i = ar.length-1;i>=0; i--) {
		System.out.println(ar[i]);
	}
}
}
