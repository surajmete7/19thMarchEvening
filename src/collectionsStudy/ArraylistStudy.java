package collectionsStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistStudy {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();
		
		al.add("Valocity");
		al.add('A');
		al.add("Velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(123.13);
		al.add(true);
		
		System.out.println(al);
		System.out.println("===================");
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Velocity"));
		System.out.println(al.get(2));
		System.out.println(al.indexOf('A'));
		System.out.println(al.remove(2));
		System.out.println(al);
		al.add(2,"pune");
		System.out.println(al);
		
		for(int i = 0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========================");
		
		ListIterator lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("==========================");
		
		for(Object j:al)
		{
			System.out.println(j);
		}
		System.out.println("=======================");
		
		ArrayList<Integer> at = new ArrayList<>();

		at.add(1);
		at.add(3);
		at.add(4);
		at.add(6);
		
		for(Integer p:at)
		{
			System.out.println(p);
		}
		System.out.println("=======================");
		
		ArrayList<Character> ac = new ArrayList<>();
		ac.add('A');
		ac.add('B');
		ac.add('C');
		ac.add('D');
		ac.add('E');
		
		Iterator<Character> itl = ac.iterator();
		
		while(itl.hasNext())
		{
			System.out.println(itl.next());
		}
		System.out.println("======================");
		
		
		
		

		
		
	}
	
	

}
