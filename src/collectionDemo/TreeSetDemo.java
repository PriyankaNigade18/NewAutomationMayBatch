package collectionDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(7);
		ts.add(4);
		ts.add(10);
		ts.add(8);
		ts.add(12);
		ts.add(6);
		ts.add(20);
		ts.add(110);
		ts.add(18);
		//ts.add(null);
		System.out.println("Total elements: "+ts.size());
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.descendingSet());
		System.out.println("HeadSet() returns Lessthan element:"+ts.headSet(2));
		System.out.println("TailSet() returns greater than and equal to: "+ts.tailSet(110));
		System.out.println("SubSet() return between from that element: "+ts.subSet(4,12));
		
		
		
		
		
		System.out.println("************************");
		TreeSet<String> name=new TreeSet<>();
		name.add("Jay");
		name.add("Bob");
		name.add("Alice");
		
		System.out.println(name);
		
		
		
		
		
		
		
		
		

	}

}
