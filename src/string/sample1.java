package string;

public class sample1 {

	
	

	public static void main(String[] args) {
		
		
	
		String s1="pravin"	;
		String s2="PRAVIN";
		String s3="abcd";
		String s4="ABCD";
		String s5="my name is Pravin";
		String s6="            ";
		String s7="bacdabc";
		String s8="java classes";
		
		
		System.out.println(s2.concat(s1));//add two string
		System.out.println(s1+s2);
		System.out.println(s8.replace("java", "salenium"));//replace
		System.out.println(s1.substring(1,4));//fetching alphabet betwwen word
		System.out.println(s7.substring(1,5));
		System.out.println("-----------print data-------------------");
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s3));
		System.out.println(s4.equalsIgnoreCase(s3));
		System.out.println(s5.contains("Pravin"));
		System.out.println("-------PRINT ALL DATA-----------");
		
		System.out.println(s1.isEmpty());//find string is empty 
		System.out.println(s1.charAt(4));//find perticular char
		System.out.println(s2.indexOf("V"));
		System.out.println(s7.lastIndexOf("b"));
		System.out.println(s5.startsWith("my"));
		System.out.println(s5.endsWith("in"));
		System.out.println("_____________________________________");
		System.out.println(s6.length());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
