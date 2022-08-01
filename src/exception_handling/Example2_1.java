package exception_handling;

public class Example2_1 {
public static void main(String[] args) {
	
	int []ar=new int[5];
	
	try {
		 ar[7]=10;
	} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBounds Exception handled");	}
	System.out.println("Hii");
}

	
	
	
	
	
	
	
	
	
}
