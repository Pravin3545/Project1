package star_pattern;

public class example17 {
public static void main(String[] args) {
	
	 int star=1;
	 for (int i = 1; i <=8; i++) {
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		star++;
	}
	int star1=7;
	for (int i = 1; i <=8; i++) {
		for (int j = 1; j <=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1--;
	}
	
}
}
