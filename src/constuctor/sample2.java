package constuctor;

public class sample2 {

	//declertion
	int a=22;
	int b=23;
	sample2()  
	{
		a=23;
		b=22;
		
	}
	
	
	
	
	public void sub() {
		
		System.out.println(a-b);
		
		
	}
	public static void main(String[] args) {
		sample2 a2=new sample2();
	a2.sub();
	
	
	
	
	}
	
}
