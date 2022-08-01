package access_specifire;

public class sample10 {

	
	
	  protected int a;
	  protected sample10() {
		  a=10;
	  }
	protected void m10() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		sample10 s10=new sample10();
		s10.m10();
		System.out.println(s10.a);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
