package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset2 {

	public static void main(String[] args)
	{		
		ArrayList al=new ArrayList();////arraylist allowed duplicate data 
		al.add("rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		//hashset does not accept duplicate data & not maitain the order
	
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}

}
