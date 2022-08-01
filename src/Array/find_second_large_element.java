package Array;

import java.util.Arrays;

public class find_second_large_element {
public static void main(String[] args) {
	

	int []ar= {24,24,25,262,27,28,29,30};
	
		Arrays.sort(ar);

	System.out.println(ar[ar.length-2]);
}
}
