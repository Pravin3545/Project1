package revise;

public class loops_nested_if {
public static void main(String[] args) {
	
	int age=50;
	int weight=49;
	
	if (age>=18) {
		System.out.println("pass--->age>=18");
		
		if (weight>=50) {
			System.out.println("pass------>wight>=50");
		}
		else {
			System.out.println("fail------->weight<=50");
		}	
	}
		else {
			System.out.println("fail--------->age<=18");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

