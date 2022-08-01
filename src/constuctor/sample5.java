package constuctor;

public class sample5 {

	float num1;
	float num2;
	
	sample5(float a, float b){
		num1=a;
		num2=b;
	}
	
	public void divide() {
		System.out.println(num1/num2);
	}
	
	public void addition() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		sample5 s5=new sample5(11,9);
		s5.divide();
		System.out.println("----------");
		sample6 s6=new sample6(11,9);
		s6.subtraction();
		
	}
	
	
}
