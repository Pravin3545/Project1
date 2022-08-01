package logics_programs;

public class febunacii_series_by_do_while_loop {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	int sum=0;
	System.out.print(a+" "+b);
	
	int i=0;
	do {
		sum=a+b;
		System.out.print(" "+sum);
		a=b;
		b=sum;
		i++;
	}
	
	while(i<=7);
	
}
}
