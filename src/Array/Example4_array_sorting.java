package Array;

import java.util.Arrays;

public class Example4_array_sorting {

	public static void main(String[] args) {
		
		
		int[]ar=new int[5];
		ar[0]=40;
		ar[1]=10;
		ar[2]=50;
		ar[3]=20;
		ar[4]=30;
		
		System.out.println("print original data------");
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		
     Arrays.sort(ar);			//convert array to ascending order
		
		System.out.println("print data in ascending order");
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("print data in descending order");
		
		for (int  i=ar.length-1;i>=0; i--) {
			System.out.println(ar[i]);
		}
	}
	
	
	
	
	
}
