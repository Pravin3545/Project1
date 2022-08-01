package star_patten_practice;

public class pattern_mirror_with_spaces {
public static void main(String[] args) {
	
	
	int star =7;
	int space=7;
	
	
	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		star=star-2;
		space++;
	}
	
	int star1=3;
	int space2=9;
	
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <=space2; j++) {
			System.out.print(" ");
		}
		
		for (int j = 1; j <=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1=star1+2;
		space2--;
	}
}
}
