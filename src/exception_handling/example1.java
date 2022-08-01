package exception_handling;

public class example1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		int div=a/b;
	try {
		div=a/b;
	} catch (ArithmeticException d) {
		System.out.println("ArithmeticException handled");
		
	}
	System.out.println("Hii");
	}
}
