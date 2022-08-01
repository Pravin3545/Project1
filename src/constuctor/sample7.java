package constuctor;

public class sample7 {

	int num1;
	int num2;
	 sample7(int a,int b){
		num1=a;
		num2=b;
	}
public void addition() {
	System.out.println(num1+num2);
}
	
	
	public static void main(String[] args) {
		
		sample7 s7=new sample7(20,12);
		s7.addition();
		sample7 s8=new sample7(12,12);
s8.addition();
		
	}
	
	
	
	
}
