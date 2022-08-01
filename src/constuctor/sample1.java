package constuctor;

public class sample1 {

	//example of user define constuctor
	
	//step1:decleration
	int num1;//10
	int num2;//20
	int num3;//40
	//user define constructor
 sample1()
	{
		num1=10;
		num2=10;
				
		num3=40;
	}
	
	public void addition() 
	
	{
		
		System.out.println(num1+num2+num3);
	}
	
	public void multiplication() {
		System.out.println(num1*num2*num3);
	}
	
	public static void main(String[] args) {
		
		sample1 s1=new sample1();
		
		s1.addition();
		s1.multiplication();
		
		
		
		
		
		
		
		
		System.out.println("---------------");
		
		sample2 s2=new sample2();
		s2.sub();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
