package constuctor;

public class sample9 {

	int num1;
	int num2;
	sample9(int a,int b){
		num1=a;
		num2=b;
	}
	public void mult() {
		System.out.println(num1*num2);
	}
	
	public void sub() {
		System.out.println(num1-num2);
	}
	public static void main(String[] args) {
		sample9 v9=new sample9(10,8);
		v9.mult();
		v9.sub();
		System.out.println("----------");
		sample8 v8=new sample8(100,7);
		v8.addition();
	}
	
	
	
}
