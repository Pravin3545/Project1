package logics_programs;

public class Example6_pallandrome {
public static void main(String[] args) {
	String name="madam";
	System.out.println("Given string for reverse:-"+name);
	String rev="";
	
	
	for (int i = name.length()-1;i>=0; i--) 
	{
	rev=rev+name.charAt(i);
	}
	System.out.println("reverse string:- "+rev);
	//System.out.println(rev);
	
	if (name.equals(rev)) {
		System.out.println("The given String Are pallindrom");
	}
	else {
		System.out.println("The given String is not Pallindrom");
	}
	
}
}
