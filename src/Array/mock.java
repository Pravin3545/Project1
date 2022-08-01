package Array;

import java.util.Arrays;

public class mock {
public static void main(String[] args) {
	int []ar=new int[6];
	ar[0]=40;
	ar[1]=50;
	ar[2]=10;
	ar[3]=20;
	ar[4]=30;
	ar[5]=60;
	
	
	System.out.println("print all data");
	for (int i = 0; i <=5; i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("reverse array");
	for (int i = ar.length-1;i>=0; i--) {
		System.out.println(ar[i]);
	}

	Arrays.sort(ar);
	System.out.println("print all data in asc");
for (int i = 0; i <=ar.length-1; i++) {
	System.out.println(ar[i]);
}
}
}
