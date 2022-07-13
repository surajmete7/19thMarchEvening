package stringMethods;

public class StringMethodUse {

	public static void main(String[] args) 
	{
		//1.length() method use
		String name ="Velocity";
		System.out.println(name.length());
		
		int lengthOfString = name.length();
		System.out.println(lengthOfString);
		
		//2.toupperCase() method use
		
		System.out.println(name);
		String m = name.toUpperCase();
		System.out.println(m);
		
		//3.tolowerCase() method use
		
		String n = name.toLowerCase();
		System.out.println(n);
		
		//4.equals() methodUse
		
		String a="Velocity";
		String b="Velocity";
		String c=new String("Velocity");
		String d=new String("Velocity");
		String e=new String("VELOCITY");
		
		//===compares memory location of two operates
		// equal methods compare character sequence of two objects
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println("=================");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println("=================");
		
		boolean result = a.equals(c);
		System.out.println("a and c are equal == "+result);
		
		System.out.println(d.equals(e));  //checking character sequence along with case sensitivity
		
		//5.equalsIgnoreCase() methodUse
		
		String city="Pune";
		String locality="Pune";
		String dist="pune";
		System.out.println("=================");
		System.out.println(city.equals(dist));
		System.out.println(city.equalsIgnoreCase(dist));
		System.out.println("=================");
		
		//6.contains() method use
		
		String k="katraj";
		
		System.out.println(k.contains("ka"));
		System.out.println(k.contains("ar"));
		
		//7.isEmpty() method use
		
		String p="Test";
		String q=" ";
		//String r=null;
		String s="";
		System.out.println("=============");
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		//System.out.println(r.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println("=============");
		
		//isBlank() method study
		System.out.println(q.isBlank());
		
		//8.charAt() method study
		String country="INDIA";
		System.out.println("=============");
		System.out.println(country.charAt(0));
		System.out.println(country.charAt(4));
		///System.out.println(country.charAt(6)); out of boundary
		System.out.println("==============");
		
		//9.endsWith() method study
		System.out.println(country.endsWith("IA"));
		System.out.println(country.endsWith("ND"));
		
		//10.startWith() method study
		System.out.println("=============");
		System.out.println(country.startsWith("IND"));
		System.out.println(country.startsWith("ND"));
		System.out.println("=============");
		
		//11.substring method use
		String testing="VELOCITY CORPORATE TRAINING";
		System.out.println(testing.substring(9));
		System.out.println(testing.substring(9, 18));
		
		//12. concat method study 
		String x="Pune ";
		String y="City ";
		
		System.out.println(x.concat(y).concat("Katraj"));
		
		//13.indexOf method use
		String state="Maharashtra";
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('a', 4));
		System.out.println(state.lastIndexOf('a'));
		
		//15. replace method use
		
		String tal="Pune";
		String myName="Suraj Dipak Mete";
		
		System.out.println(tal.replace("P", "D"));
		
		System.out.println(tal.replace("Pu", "Ku"));
		System.out.println(myName.replaceAll(" ", "*"));
		
				
		
	}

}
