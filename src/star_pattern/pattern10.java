package star_pattern;

public class pattern10 {

	


	
	public static void main(String[] args) {
		
//		*
//		**
//		***
	//	
		
		int star1=5;
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=star1; j++) {
				System.out.print("*");
			}
			System.out.println();
			star1--;
		}
		
		
		
		int star=2;
		for (int i = 1; i<=4; i++)						//outer for loop -->rows
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

	
	
	
	
	
	
	
	
	
	
	
	
	

