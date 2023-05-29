package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class examle1_ArrayList {
		
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("rahul");
		al.add("101");
		al.add("64.f");
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		
		al.add(4,500);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println("print data using Iterator cursor-----");
		Iterator itr=al.iterator();
		
		while(itr.hasNext())//True
		{
			System.out.println(itr.next());
			
		}

		System.out.println("----print data using List Iterator List Iterator cursor------");
	
ListIterator litr = al.listIterator();
while (litr.hasNext()){
	System.out.println(litr.next());
}
System.out.println("-----print data using for loop-----");


for(int i=0; i<=al.size()-1; i++){
	System.out.println(al.get(i));
	
}
System.out.println("---print data using for each loop----");

for(Object sl: al)
{
	System.out.println(s1);
}
System.out.println(al.size());
al.clear();
System.out.println(al.size()); 
	
	
	
	
	
	
	
	
	
	
	

}
