package star_pattern;

public class Example16 {
public static void main(String[] args) {
	int star=6;
	for (int i = 1; i<=6; i++) {
		for (int j = 1; j<=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		star--;
	}
	int star1=2;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j<=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1++;
	}
	
	
	
}
}
	
	

