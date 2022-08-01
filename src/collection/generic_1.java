package collection;

import java.util.TreeSet;

public class generic_1 {
	public static void main(String[] args)
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(700);
		tr.add(100);
		tr.add(400);
		tr.add(200);
		tr.add(300);
		tr.add(600);
		tr.add(500);
		tr.add(500);

		System.out.println("--print all data using for each loop-----");
		
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
				
	}
}
