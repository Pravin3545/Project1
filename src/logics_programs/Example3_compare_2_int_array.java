package logics_programs;

import java.util.Arrays;

public class Example3_compare_2_int_array {
public static void main(String[] args) {
	
	
	int ar1[]= {10,20,80};
	int ar2[]= {50,60,70};
	int ar3[]= {50,60,70};
	
	
	System.out.println(Arrays.equals(ar1, ar2));//false
	System.out.println(Arrays.equals(ar2, ar3));//true
	System.out.println(Arrays.equals(ar1, ar3));//false

}
}
