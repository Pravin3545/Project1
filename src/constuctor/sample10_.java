package constuctor;

public class sample10_ {

	int num1;
	int num2;
	String fname;
	
	sample10_(int a, int b){
	num1=a;
	num2=b;}
	
	sample10_(String e){
		fname=e;
	}
	public void m1() {
		System.out.println( num1*num2);
	}
	
	public void m2() {
		System.out.println(fname);
	}
	
	
	public static void main(String[] args) {
		sample10_ s=new sample10_(20,30);
		s.m1();
		
		sample10_ b=new sample10_("Pravin");		
		b.m2();
		
		
		
		
		
	}
}
