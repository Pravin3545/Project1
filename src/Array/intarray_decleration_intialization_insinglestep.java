package Array;

import java.util.Arrays;

public class intarray_decleration_intialization_insinglestep {

	public static void main(String[] args) {
		
		
		int[]ar= {10,30,60,40,50};
		System.out.println(ar.length);//5
		System.out.println(ar[1]);//20
		
		
		System.out.println("-----------------------------------------------------");
	for (int i =0; i <= ar.length-1; i++) {
		System.out.println(ar[i]);
	}
	//print in reverse order
	System.out.println("print in reverse order");
	
		for (int i =ar.length-1;i>=0; i--) {
			System.out.println(ar[i]);
		}
		//System.out.println();
		Arrays.sort(ar);
		System.out.println("print data in ascending");
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("print data in descending");
		for (int i = ar.length-1;i>=0; i--) {
			System.out.println(ar[i]);
			
			System.out.println("print 2nd largest");
			System.out.println(ar[ar.length-2]);
		}
	}
	
	
	
	
	
	
	
	
}
