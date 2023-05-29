package collection;

import java.util.ArrayList;

public class Example1_ArrayList {
	public static void main(String[] args) {
		
		//Arraylist a1=new ArrayList();// initial /by default capacity=10
		ArrayList a1=new ArrayList(8); //Initial capacity=8
		
		a1.add("rahul");
		a1.add("101");
		a1.add(65.5f);//2
		a1.add('A');
		a1.add(101);//500
		a1.add(null);//101
		a1.add(null);//null
		             //null
		System.out.println(a1);
		System.out.println(a1.size());//4
		System.out.println(a1.isEmpty());//false
		System.out.println(a1.get(0));//rahul
		//add info in between arraylist -->right shift operation
		a1.add(4,500);
		System.out.println(a1);
		//remove info in between arraylist --> left shift operation
		a1.remove(4);
		System.out.println(a1);
		
		
		
		
		
	}

}
