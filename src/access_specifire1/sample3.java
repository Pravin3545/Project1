package access_specifire1;
//public access specifire
public class sample3{

	int b;
	sample3(){
		b=20;
	}
	
	
	public void m3() {
		
	

		System.out.println(b);
}

	
	
	public static void main(String[] args) {
		sample3 d=new sample3();
		d.m3();
		System.out.println(d.b);
	}
}
