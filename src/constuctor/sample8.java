package constuctor;

public class sample8 {
int num1;
int num2;

sample8(int a,int b){
	num1=a;
	num2=b;
}
public void addition() {
	System.out.println(num1+num2);
}

public void multiplication() {
	System.out.println(num1*num2);
}

public static void main(String[] args) {
	
	sample8 v5=new sample8(23,5);
	
	v5.addition();
	v5.multiplication();
	System.out.println("----------------");
	sample8 v6=new sample8(1107,88);
	v6.addition();
	v6.multiplication();
	System.out.println("----------");
	sample7 v8=new sample7(11,7);
	v8.addition();
	
	
	
}


}
