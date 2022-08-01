package access_specifire1;

public class sample1{

	
	
	private int  a;
	
	sample1() {
		a=10;
	}
	
	 private void m1 () {
		System.out.println(a);
	}
	 
	 public static void main(String[] args) {
		sample1 s=new sample1();
		s.m1();
		
	}
}

