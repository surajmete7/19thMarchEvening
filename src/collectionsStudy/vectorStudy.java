package collectionsStudy;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("Pune");
		v.add('M');
		v.add("Pune");
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(123.23);
		v.add(true);
		
		System.out.println(v);
		System.out.println("==============");
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.remove(0));
		System.out.println(v);
		System.out.println(v.get(3));
		
		System.out.println("============");
		
		ListIterator lit = v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("=============");
		Enumeration el = v.elements();
		while(el.hasMoreElements())
		{
			System.out.println(el.nextElement());
		}
		System.out.println("==================");
		
		
		
	}

}
