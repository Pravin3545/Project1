package logics_programs;

public class bb {
public static void main(String[] args) {
	int a=371 ,b,c,d = 0;
	b=a;
	
	while(b!=0) {
		c=b%10;
		d +=Math.pow(c, 3);
		b/=10;
		
	}
	
	if (d==a) {
		System.out.println(a+" is armstrong number");
	}
	else {
		System.out.println("not");
	}
}
}
