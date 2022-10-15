package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
			LinkedHashSet<Integer> ls=new LinkedHashSet<>();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(30);
			ls.add(80);
			ls.add(60);
			System.out.println("Is list empty?: "+ls.isEmpty());
			System.out.println("Total Elements are: "+ls.size());
			System.out.println(ls);

	}

}
