package star_patten_practice;

public class pattern1 {//star with spaces
public static void main(String[] args) {
	int star = 1;
	int spaces = 4;
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=spaces; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		star++;
		spaces--;
	}
	
	int star1=4;
	int speces1=1;
	
	
	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=speces1; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1--;
		speces1++;
	}
}
	
	
	
	
	
	
	
	
	
	
}
