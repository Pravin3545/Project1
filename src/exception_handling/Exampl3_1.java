package exception_handling;

public class Exampl3_1 {
public static void main(String[] args) {
	String s1="abcd";
	
//	try {
//		System.out.println(s1.charAt(5));
//	} catch (StringIndexOutOfBoundsException e) {
//		System.out.println("StringIndexOutOfBoundsException handled");
//	}
//	System.out.println("Hiiii");
//	
//	
	try {
		System.out.println(s1.charAt(5));
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBounds Exception handled");
	}
	System.out.println("Hii");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
