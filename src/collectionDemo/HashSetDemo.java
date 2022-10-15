package collectionDemo;

import java.util.HashSet;

/*HashSet is class implements Set interface
 * Underline data structure is HashTable
 * total 16 segment
 * Hashing mechanism and data get store in table
 * unique data + Unordered collection
 * 
 */
public class HashSetDemo
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		System.out.println("Is set empty:? "+hs.isEmpty());
			hs.add(10);
			hs.add(20);
			hs.add(30);
			hs.add(40);
			hs.add(null);
			hs.add(10);
			System.out.println(hs);
			System.out.println("Is set empty:? "+hs.isEmpty());
			System.out.println("Total elements: "+hs.size());
			System.out.println("Check 100?: "+hs.contains(100));
			System.out.println("Check 20?: "+hs.contains(20));
			hs.remove(10);
			System.out.println(hs);
//			hs.clear();
//			System.out.println(hs);
			
			//iteration
			
			for(Integer i:hs)
			{
				System.out.println(i);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
