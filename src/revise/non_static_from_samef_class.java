package revise;

public class non_static_from_samef_class {

	
	public static void main(String[] args) {
		
		non_static_from_samef_class s=new non_static_from_samef_class();
		
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		non_ststic_from_dif_classs s1=new non_ststic_from_dif_classs();
		s1.m5();
		s1.m6();
		s1.m7();
		s1.m8();
		
		
		
		
	}
	public void m1() {
		System.out.println("non static method m1 call from same class");
	}
	
	public void m2() {
		System.out.println("non static method m2 call from same class");
	}
	public void m3() {
		System.out.println("non static method m3 call from same class");
	}
	public void m4() {
		System.out.println("non static method m4 call from same class");
	}
	
	
	
	
	
}
