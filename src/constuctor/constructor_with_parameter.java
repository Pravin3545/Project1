package constuctor;

public class constructor_with_parameter {

	//example3:user define constructor with parameter
	
	int num1=10;
	int num2=20;
	
public constructor_with_parameter(int i, int j) {
		// TODO Auto-generated constructor stub
	}

//	constructor_with_parameter(int a, int b){
//		num1=a;
//		num2=b;
//	}
	
	public void addition() {
		System.out.println(num1+num2);
	}
	
	public void multiplication() {
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		
		constructor_with_parameter s1=new constructor_with_parameter(10,20);
		s1.addition();
		s1.multiplication();
		
		
	}
	
	
}
