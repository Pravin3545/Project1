package star_pattern;

public class pattern5 {
public static void main(String[] args) {
	
//	*
//	**
//	***
//	
	
	int star=1;
	for (int i = 1; i<=4; i++)						//outer for loop -->rows
	{			
		for (int j = 1; j<=star; j++) //inner for loop --->column
		{
			System.out.print("*");
		}
		System.out.println();
		star++;
	}
	

	int star1=3;
	for (int i = 1; i<=4; i++) {
		for (int j = 1; j<=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		star1--;
	}
	
	
	
	
	
	
	
	
}
}
