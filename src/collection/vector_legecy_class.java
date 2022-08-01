package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_legecy_class {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	
	
	v.add("PRAVIN");
	v.add(500);
	v.add(99.9f);
	v.add("A");
	v.add(500);
	v.add(null);
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.contains("A"));
	System.out.println(v.isEmpty());
	System.out.println(v.get(4));

	System.out.println(v);
	//add info in  between vector   ----->right shifting operation
	v.add(2, 99.99f);       
	System.out.println(v);
	
	
	v.remove(2);       //---------------> left shifting operation
	
	System.out.println(v);
	
	
	
	v.set(4, "BODKE");
	System.out.println(v);
	
	System.out.println("Print data using iteretor cursor");
	
	Iterator vc = v.iterator();
	System.out.println("print data using while loop");
	while(vc.hasNext()) {
		System.out.println(vc.next());
	}
	
	System.out.println("Print data using for loop");
	
	for(int i=0;i<=v.size()-1;i++) {
		System.out.println(v.get(i));}
		
		System.out.println("print data using for each loop");
		
		for(Object s2:v) {
			System.out.println(s2);
		}
		
		
		System.out.println("print data using listiteretor cursor");
		
		ListIterator v1 = v.listIterator();
		
		
		System.out.println("print data using while loop");
		
		while(v1.hasNext()) {
			System.out.println(v1.next());
		}
		
		System.out.println("print data using for loop");
		for (int i = 0; i<=v.size()-1; i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("print data using for each loop");
		
		for(Object v2:v) {
			System.out.println(v2);
		}
		
		System.out.println("print Data using enemuration cursor");
		
		Enumeration enu = v.elements();
		System.out.println("print data using while loop");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());}
//		for(i=0;i<=v.size()-1;i++) {
//			System.out.println(v.get(i));
//		}
		
		System.out.println("print data using for each loop");
		for(Object v3:v) {
			System.out.println(v3);
		}
	}
	
	
}

