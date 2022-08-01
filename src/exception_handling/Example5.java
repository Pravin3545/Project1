package exception_handling;

public class Example5 {
public static void main(String[] args) {
	
	String s1="abcd";
	
	
	try {
		System.out.println(s1.charAt(7));
	} catch ( ArithmeticException a) {
		System.out.println("ArithmeticException handled");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException handled");
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}catch (Exception e) 
	{
		System.out.println("generic exception handled");
	}
	
	
	System.out.println("Hii");
	
	
	
}
}
