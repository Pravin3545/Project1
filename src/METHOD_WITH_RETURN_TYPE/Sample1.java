package METHOD_WITH_RETURN_TYPE;

public class Sample1 {

	public static void main(String[] args) {
		
	int num3=	 addition(10, 20);
	int num4=    addition(5,6);
		System.out.println("-------------------------------");
		System.out.println(num3*num4);
		
		
		System.out.println(addition(100,900));
	}
	
	
	public static int addition(int num1,int num2) {
		
		int add = num1+num2;
		System.out.println(add);
		return add;
	}
	
	
	
	
}
