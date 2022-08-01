package revise;

public class method_with_parameter {

	public static void main(String[] args) {
		
		
		m1(30,40);
		m1(1,2);
		m1(455,565);
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		method_with_parameter s2=new method_with_parameter();
		s2.m2(30, 39);
		s2.m2(330, 39);
		s2.m2(3, 39);

		
		
		
	}
	
	public static void m1(int a,int b) {
		System.out.println(a+b);
	}
	public void m2(int a,int b) {
		System.out.println(a*b);
	}
	
	
	
}
