package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset_1 {
	public static void main(String[] args)
	{		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(65.5f);
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());  //false
		System.out.println(lhs.contains(100));  //true
		
		lhs.remove('A');
		
		System.out.println(lhs);
		
		System.out.println("---print all data using iterator cursor---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--print all data using foreach loop--");
		for(Object s1:lhs) 
		{
			System.out.println(s1);
		}
		
	}
}
