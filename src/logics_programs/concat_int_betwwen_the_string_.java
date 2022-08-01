package logics_programs;

public class concat_int_betwwen_the_string_ {
public static void main(String[] args) {
	String s1= "sdb554d55D455D598";
	// boolean a = Character.isDigit(s1.charAt(i));
	// System.out.println(a);
	 int sum=0;
	 for(int i=0; i<=s1.length()-1; i++)
	 {
		 if(Character.isDigit(s1.charAt(i))==true)
		 {
			 sum=sum+Character.getNumericValue(s1.charAt(i));
		 }
	 }
	 

           System.out.println(sum);
}
}
