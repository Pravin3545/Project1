package constuctor;

public class sample10 {
// costructor overloading
	
	String name;
	int num1;
	int num2;
	//constructor with string 
	sample10(String s1){
		name = s1;
	}
	//constructor without parameter
	
	sample10(){
		num1=10;
		num2=20;
	}
	//constructor with 2 int parameter
	sample10(int a,int b){
		num1=a;
		num2=b;
		
	}
	public void studentname() {
		System.out.println(name);
	}
	public void addition() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		sample10 v10=new sample10("krushana");
		v10.studentname();
		System.out.println("---------");
		sample10 v11=new sample10(12,23);
		v11.addition();
		System.out.println("-------------");
		sample10 v12=new sample10();
		v12.addition();
		
	}
	
	
	
	
	
	
}
