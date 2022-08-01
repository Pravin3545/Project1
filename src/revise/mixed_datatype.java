package revise;

public class mixed_datatype {

	public static void main(String[] args) {
		
		studentname("pravin");
		studentname("krushana");
		studentname("dada");
		System.out.println("--------------------------------------------------------");
		mixed_datatype s3=new mixed_datatype();
		s3.studentinfo("pravin"," bodke");
		System.out.println("------------------------------------------------------------");
		mixed_datatype1 s4=new mixed_datatype1();
		s4.studentinformation("pravin", "bodke", 2, 'a', 99f);
		
	}
	
	
	public static void studentname(String name) {
		System.out.println(name);
	}
	
	public void studentinfo(String fname,String lname) {
		System.out.println(fname+""+lname);
	}
	
}
