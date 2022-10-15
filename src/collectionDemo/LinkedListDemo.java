package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/*LinkedList is class implements List interface
 * Under line data structure for linked list is Doubly link
 * frequent operations are insertion and deletion 
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args)
	{
			LinkedList<Integer> ls=new LinkedList<>();
			if(ls.isEmpty())
			{
			ls.add(10);
			//ls.add(null);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(20);
					
			}
			System.out.println("Total Elements are: "+ls.size());
			System.out.println("Check 60?: "+ls.contains(60));
			System.out.println("Check 20?: "+ls.contains(20));
			
			//Print
			System.out.println(ls);
			ls.addFirst(100);
			ls.addLast(200);
			System.out.println(ls);
			System.out.println("First Element: "+ls.getFirst());
			System.out.println("Last Element: "+ls.getLast());
			
			//Iterate
			
			ls.add(3,55);
			System.out.println(ls);
			ls.remove(3);
			System.out.println(ls);
			//for-each
			for(Integer i:ls)
			{
				System.out.println(i);
				if(i.equals(20))
				{
					break;
				}
			}
			System.out.println("************");
			
			//iterator
			Iterator<Integer> ir=ls.iterator();
			
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
