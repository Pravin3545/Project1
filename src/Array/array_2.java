package Array;

public class array_2 {
public static void main(String[] args) {
	

	int[]ar=new int[9];                   
	
	
	ar[0]= 10;
	ar[1]= 20;
	ar[2]= 30;
	ar[3]= 40;
	ar[4]= 50;
	ar[5]= 60;
	ar[6]= 70;
	ar[7]= 80;
	ar[8]= 90;

	System.out.println(ar.length);//9
	System.out.println(ar[4]);//50
	System.out.println("---------2nd largest array-------------");
	System.out.println(ar[ar.length-2]);
	
	System.out.println("------------all data-----------------");
	for (int i = 0; i <= ar.length-1; i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("-------------reverse-----------------");
	
for (int i=ar.length-1;i>=0; i--) 
{
	System.out.println(ar[i]);
}


}
}
	
	
	
	
	

