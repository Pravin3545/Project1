package constuctor;

public class sample3 {

	
	int num1;
	
	int num2;
	
	sample3(int a,int b){
		num1=a;
		num2=b;
	}
	public void addition() {
		System.out.println(num1+num2);
	}
	
	
	public void multiplication() {
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args) {
		
		sample3 s3=new sample3(10,5);
		s3.addition();
		s3.multiplication();
		
	}
	
}
