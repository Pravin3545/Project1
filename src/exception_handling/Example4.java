package exception_handling;

public class Example4 {
public static void main(String[] args) {
	
	//generic exception
	
	String s2="abcde";
	
	try {
		System.out.println(s2.charAt(7));
	} catch (Exception e) {
		System.out.println("generic exception handled");
		e.printStackTrace();
	}
	System.out.println("Hii");
	
}
}
