package star_pattern;

public class pattern3 {
//***
//***
	public static void main(String[] args) {
		int star=3;
		for (int i = 1; i<=4; i++) //outer loop -->rows
		{
			for (int j = 1; j <=star; j++)// inner loop --->column
			{
				System.out.print("*");
			}
			System.out.println();
			//star++;
		}
	}
	
	
	
	
}
