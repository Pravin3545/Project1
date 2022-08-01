package exception_handling;

public class example3 {

	
	public static void main(String[] args) {
		String s1 ="abcd";
		try {
		System.out.println(s1.charAt(5));
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		System.out.println("HII");
	}
}
