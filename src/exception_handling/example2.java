package exception_handling;

public class example2 {
public static void main(String[] args) {
	
	int []ar=new int[5];
	try {
		ar[7]=10;
	}
	catch (StringIndexOutOfBoundsException e) {
System.out.println("StringIndexOutOfBoundsException handled");	}
	
	catch (ArithmeticException e) {
System.out.println("ArithmeticException handled");	}
	
	
	catch(ArrayIndexOutOfBoundsException s1) {
		System.out.println("ArrayIndexOutOfBoundsException  handled");}
		catch (Exception e) {
System.out.println("Generic Exception Handled");		}
	
	
	System.out.println("Hello");
	
	
	
}
}
