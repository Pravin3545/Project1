package access_specifire;

public class sample20 {

	protected int c;
	protected sample20 () {
	c=30;
	}
	protected void m20() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		sample20 s20=new sample20();
		s20.m20();
		System.out.println(s20.c);
	}
	
	
	
	
	
	
}
