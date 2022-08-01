package revise;

public class Reverse_string {
public static void main(String[] args) {
	
	
	String n1=new String("My name is Pravin");
	
	String rev=new String("");;
	
	for (int i =n1.length()-1; i>=0; i--) {
		rev=rev+n1.charAt(i);
	}
	System.out.println(rev);
	if (n1.equals(rev)) {
		System.out.println("pallandrom");
	}
	else {
		System.out.println("not");
	}
}

}
