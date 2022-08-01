package abstract_class;

public  class sample2 extends sample1 {

	public void m2() {
		System.out.println("method m2 completed in concrete class");
	}
	
	public void m3() {
		System.out.println("method m3 completed in concrete class");
	}

	public static void main(String[] args) {
		
		
		sample2 s2=new sample2();
		s2.m1();
		s2.m2();
		s2.m3();
		
		
		
	}
	
}
