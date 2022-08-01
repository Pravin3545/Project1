package constuctor;

public class multiple_constructor1 {

	

		String name;
	   int num1;
	   int num2;
	
	multiple_constructor1(String s1){
		  name = s1;
	}
	multiple_constructor1(int a,int b){
		
		num1=a;
		num2=b;
	}
	
	public void addition() {
		
		System.out.println(num1+num2);
	}
	
	public void studentname(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		//multiple_constructor1 v3=new multiple_constructor1(10,5);
	//v3.m1();
		//v3.m2();
		multiple_constructor1 v4=new multiple_constructor1("String name");
		v4.studentname("PRAVIN");
		
		
		
		multiple_constructor1 q=new multiple_constructor1(20,90);
                        q.addition();
		
	}
	
	
	
	
	
}
