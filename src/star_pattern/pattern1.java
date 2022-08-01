package star_pattern;

public class pattern1 {

	
	public static void main(String[] args) {
//		//**********
//		int star=1;
//		for (int i = 1; i <=10; i++) {//rows
//			for (int j = 1; j <=1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//	
	
//	   int star=4;
//     	for (int i = 1; i <=4; i++) {
//		for (int j =1; j <=star; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		star++;
//	}
	
	
	
	
	
	int star=1;
	
	
     	for (int i = 1; i<=10; i++)						//outer for loop -->rows
    	{			
    		for (int j = 1; j<=star; j++) //inner for loop --->column
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    		star++;
    	}
	
	
	
	
	
	
	
}
	}
