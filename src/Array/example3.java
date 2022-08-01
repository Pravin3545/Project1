package Array;

public class example3 {
public static void main(String[] args) {
	
	int[][] ar= {{1,2,3,4},{5,6,7,8}};
	
	System.out.println(ar.length);
	System.out.println(ar[1][3]);
	
	System.out.println("--------------------------------");
	for (int i = 0; i<=1; i++) {
		for (int j = 0; j<=3; j++) {
			System.out.print(ar[i][j]+"    ");
		}
		System.out.println();
	}

	
	
	
	
	
}
}
