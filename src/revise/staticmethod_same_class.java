package revise;

public class staticmethod_same_class {

	public static void main(String[] args) {
		
		m1();
		m2();
		m3();
		m4();
		System.out.println("------------------------------");
		staticmethod_call_from_diff_class.m5();
		staticmethod_call_from_diff_class.m6();
		staticmethod_call_from_diff_class.m7();
		staticmethod_call_from_diff_class.m8();
	}
	
	public static void m1() {
		System.out.println("static method m1 call from same class");
	}
	
	public static void m2() {
		System.out.println("static method m2 call from same class");
	}
	public static void m3() {
		System.out.println("static method m3 call from same class");
	}
	public static void m4() {
		System.out.println("static method m4 call from same class");
	}
	
	
	
	
	
	
	
	
}
