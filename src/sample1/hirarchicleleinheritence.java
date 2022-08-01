package sample1;

public class hirarchicleleinheritence {

	public static void main(String[] args) {
		System.out.println("properties of son1");
		son1 s1=new son1();
		s1.bike();
		s1.car();
		s1.money();
		s1.home();
		System.out.println("------------------");
		System.out.println("properties of son2");
		son2 s2=new son2();
		s2.laptop();
		s2.car();
		s2.money();
		s2.home();
		System.out.println("-----------------");
		System.out.println("properties of son3");
		son3 s3=new son3();
		s3.mobile();
		s3.car();
		s3.money();
		s3.home();
		
		
	}
}
