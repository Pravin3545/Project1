package access_specifire;

public class sample2 {
int b;           //2.example of default access specifire
 sample2() {
	b=20;
}
void m2 (){
	System.out.println(b);
}

public static void main(String[] args) {
	sample2 s2=new sample2();
	s2.m2();
	System.out.println(s2.b);
	
	
	
	
	
	
}
}
