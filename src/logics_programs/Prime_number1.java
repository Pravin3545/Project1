package logics_programs;

import java.util.Scanner;

public class Prime_number1 {
public static void main(String[] args) {
	  int num,i,count; 
      Scanner s=new Scanner(System.in); 
      System.out.println("Enter A Number:-"); 
      num =s.nextInt(); 
       
      count=0; 
      i=2;
       while(i< num) 
          { i++;
              if(num%i==0) 
                 count++; 
                 break;
                 
          } 
           if(count==1) 
           System.out.println(num +"is not a prime number"); 
           else 
           System.out.println(num +" is  a prime number"); 
 
}
}
