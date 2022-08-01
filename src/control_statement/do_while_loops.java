package control_statement;

public class do_while_loops {
public static void main(String[] args) {
	
int a=1;

       do {
		System.out.println(a*5);     //from do while loop
		a++;
	} while ( a<=10);
	
       System.out.println("------------------------------");
       for (int i = 1; i <=10; i++) {     //from for loop
		System.out.println(i*2);
	}System.out.println("--------------------------------");
     
	
	while (a<=10) {             //from while loop only
		System.out.println(a*8);
	a++;
	}
}
}
