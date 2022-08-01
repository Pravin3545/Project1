package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist_I {
public static void main(String[] args) {
	//ArrayList al=new ArrayList();          //initial default storage capacity= 10
	
	ArrayList al=new ArrayList(8);
	
	al.add("Pravin");//0
	al.add(200);//1
	al.add(85.5f);//2
	al.add('A');//3
	al.add(200);//4
	al.add(null);//5
	al.add(null);//6
	
	System.out.println(al);
	System.out.println(al.size());//7
	System.out.println(al.isEmpty());//false
	System.out.println(al.contains('A'));//true
	System.out.println(al.get(4));//200
	
	
	System.out.println(al);
	// add info between arraylist---->Right shift Opertion
	al.add(4, 500);
	System.out.println(al);
	
	//remove info from arraylist------> left shift opertion
	al.remove(4);
	System.out.println(al);
	
	//modify info of arraylist------>existing opertion
	al.set(4, 500);
	System.out.println(al);
	
	System.out.println("print arraylist  all data with itretor cursor ");
	Iterator atr = al.iterator();
	//al.ensureCapacity(7);
	while (atr.hasNext()) {
		System.out.println(atr.next());
		}
	System.out.println("Print all arraylist data using listitretor cursor");
	
	ListIterator list = al.listIterator();
	while (list.hasNext()) {
		System.out.println(list.next());
	}
		System.out.println("Print all arraylist data using for loop");
		for (int i = 0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Print all data using foreach loop");
		
		for(Object s1:al) {             
			System.out.println(s1);
		}
	}
	
}

