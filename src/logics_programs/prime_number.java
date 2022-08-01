package logics_programs;

public class prime_number {
public static void main(String[] args) {
	

	int num=6;
	int count=0;
	
	for (int i = 2; i <num; i++) {
		
		
		if (num %i==0) {
			count++;
			break;
		}
	}
	
	if (count==1) {
		System.out.println("The Number:-"+num+" Is Not Prime Number");
	}
	else {
		System.out.println("The Given Number:-"+num+" is Prime");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
