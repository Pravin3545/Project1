package sample1;

public class nested_if_1 {
public static void main(String[] args) {
	
	
	int sp=6000;
	if (sp>=500) {
		System.out.println("no delivery charges applied");
		
		if (sp>=5000) {
			System.out.println("10% discount added");
		}
		else {
			System.out.println("no additional discount");
		}
		
	}
	else {
		System.out.println("50 rs delivery charge apply");
	}
	
}
}
