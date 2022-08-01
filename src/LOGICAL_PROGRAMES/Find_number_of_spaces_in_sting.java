package LOGICAL_PROGRAMES;

public class Find_number_of_spaces_in_sting 
{
	public static void main(String[] args) 
	{
		String s1="a b c  d      v      f";
		int count=0;
		for (int i = 0; i <s1.length()-1; i++) {
			
			 char s2=s1.charAt(i);
			 if (s2==' ') {
				count++;
			}}
		System.out.println("number of spaces in given string:-"+count);
		System.out.println(s1.replace(" ",""));
	}
	}
