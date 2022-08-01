package logics_programs;

public class Example5_reverse_string {
public static void main(String[] args) {
	String org="My name is Pravin";
	String rev="";
	
	for (int i = org.length()-1;i>=0; i--) 
	{
		rev=rev+org.charAt(i);
		
	}
	System.out.println("original string :"+org);
	System.out.println("Reverse String:"+rev);
}
}
