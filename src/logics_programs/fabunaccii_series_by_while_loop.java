package logics_programs;

public class fabunaccii_series_by_while_loop {
	public static void main(String[] args) {
		//The Fibonacci formula is given as, Fn = Fn-1 + Fn-2, where n > 1.
	
//	int a=0;
//	int b=1;
//	int sum=0;
//	
//	System.out.print(a+" "+b);
//	int i=0;
//	while(i<=8) {
//		 sum=a+b;
//			System.out.print(" "+sum);
//			a=b;
//			b=sum;
//			i++;
//	}
	

	int s=0;
	int s1=1;
	int sum1=0;
	System.out.print(s+" "+s1);
	
	for (int j =0; j<=8; j++) {
		sum1=s+s1;
		System.out.print(" "+sum1);
		s=s1;
		s1=sum1;
	}
	
	
}}