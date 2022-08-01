package Array;

public class intarray_decleration_intialization_multiple_coordinats_singlestep {

	public static void main(String[] args) {
		
		int[][]ar= {{10,20,30},{40,50,60},{50,70,90}};
		
		
		System.out.println(ar.length-1);
		System.out.println(ar[0][2]);
		
		System.out.println("-------------------------------");
		for (int i = 0; i<=2; i++) {//outer row
			for (int j = 0; j<=2; j++) {//inner column
				System.out.print(ar[i][j]+"           ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("------------------------------------------");
		
		for (int i = 0; i <=ar.length-1; i++) {
			for (int j = 0; j <=ar.length-1; j++) {
				System.out.print(ar[i][j]+"                  ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
