package access_specifire;

public class sample3 {
//3.example of protected access specifire
	protected int c;
	protected sample3() {
		c=30;
	}
	
	protected void m3() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		sample3 s3=new sample3();
		s3.m3();
		System.out.println(s3.c);
	}
	
	
	
	
}
