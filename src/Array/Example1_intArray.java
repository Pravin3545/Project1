package Array;

import java.util.Arrays;

public class Example1_intArray {
public static void main(String[] args) {
	
	//step 1 = array initialization
	int[] ar=new int[6];
	
	
     //	step 2 : array decleration
	
	ar[0]=40;
	ar[1]=10;
	ar[2]=50;
	ar[3]=20;
	ar[4]=30;
	ar[5]=60;
	
     //	step 3:array usage
	System.out.println(ar[2]);
	System.out.println(ar.length);
	
	
	System.out.println("print all data from int array");
	
//	for (int i = 0; i < ar.length-1; i++) {
//		System.out.println(ar[i]);
//	}
//	
	
	for (int i = 0; i<=5; i++) {
		System.out.println(ar[i]);
	}
	
	
	
	
	System.out.println("------------print reverse-----------------");
	
	Arrays.sort(ar);
	for (int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);}
	
	System.out.println("print ascending");
	for (int i = 0; i<=5; i++) {
		System.out.println(ar[i]);
	}
	
	//System.out.println();
	
	
	System.out.println("--------second largest no");
	
	Arrays.sort(ar);
	System.out.println(ar[ar.length-2]);
	
	
	
	
	
	
}













	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
