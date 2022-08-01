package star_patten_practice;

public class mirror_array {
public static void main(String[] args) {
	int star1=5;
	
	for (int i = 1; i<=5; i++) {
		for (int j = 1; j <=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1--;
	}
	 int star2=1;
	 
	 for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=star2; j++) {
			System.out.print("*");
		}
		System.out.println();
		star2++;
	}
}
}
