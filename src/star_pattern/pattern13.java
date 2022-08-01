package star_pattern;

public class pattern13 {
	
	public static void main(String[] args) {
		
	
// *******
//  *****
//   ***
//    *
//
	
	
	int star=7;
	int spaces=0;
	for (int i = 1; i <=7; i++) {
		for (int j = 1; j <=spaces; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		star=star-2;
		spaces++;
	}
}
}