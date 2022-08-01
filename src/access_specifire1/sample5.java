package access_specifire1;

public class sample5{

	protected int c;
	public sample5() {
		c=30;
	}
 protected  void m5() {
		System.out.println(c);
	}
 
 public static void main(String[] args) {
	sample5 f=new sample5();
	f.m5();
	System.out.println(f.c);
	
	
}
 
}

