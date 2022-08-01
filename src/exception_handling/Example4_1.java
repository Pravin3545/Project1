package exception_handling;

public class Example4_1 {
public static void main(String[] args) {
	
	String s2="abcd";
	try {
		System.out.println(s2.charAt(5));
	} catch (Exception e) {
System.out.println("generic exception");
e.printStackTrace();
	}
	System.out.println("Hiii");
	
	
	
	
}
	
	
	
	
}
