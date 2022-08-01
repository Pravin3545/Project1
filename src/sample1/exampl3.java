package sample1;

public class exampl3 {

	public static void main(String[] args) {
		
		
		// nested if for two int parameter
		int age=18;
		int weight=22;
		if (age>=18) {
			System.out.println("criteria 1:pass--->age>=18");
			
			if (weight>=50) {
				System.out.println("criteria 2:pass---->weight>=50-->eligible for blood donation");
			}
			
			else {
				System.out.println("criteria 2:fail---->weight<=50--> not eligible for blood donation");
			}
		}
		
		
		
		else {
			System.out.println("criteria 1:fail---->age<18--> not eligible for blood donation");
		}
	}

}
