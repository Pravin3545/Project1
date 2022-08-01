package constuctor;

public class sample3_1 {

	int num1;
	int num2;
	sample3_1(int a,int b){
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
		sample3_1 s3_1=new sample3_1(100,50);
		s3_1.addition();
		s3_1.multiplication();
		System.out.println("------------");
		sample3_1 s31=new sample3_1(110,20);
		s31.addition();
		
	System.out.println("----------------");
	sample4 s2=new sample4(100,80);
		s2.subtraction();
		System.out.println("------------");
		sample3_1 s21=new sample3_1(100,30);
		s21.addition();
		s21.multiplication();
	}
	
}
