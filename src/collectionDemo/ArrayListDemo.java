package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	/*ArrayList is class implements List interface
	 * under line data structure is Dynamic Array
	 * Capacity of ArrayList 10 virtual segments.
	 * Order collection & duplication allowed
	 */
	
	public static void main(String[] args)
	{
		//Generic   type safe
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is List is Empty?: "+al.isEmpty());//true
		al.add(100);
		al.add(500);
		al.add(300);
		al.add(400);
		al.add(200);
		
		System.out.println(al);
		int num=al.get(0);
		System.out.println(num);
		System.out.println("Is List is Empty?: "+al.isEmpty());//false
		System.out.println("Total elements: "+al.size());
		System.out.println("check 300 is available? : "+al.contains(300));
		System.out.println("check 500 is available? : "+al.contains(500));
		al.add(0,800);
		
		System.out.println(al);
		al.remove(3);
		System.out.println("After Remove List is: "+al);
		//al.clear();
		
		System.out.println(al);
		//class
		Collections.sort(al);
		
		System.out.println(al);
		
		ArrayList<Integer> result=new ArrayList<>();
		for(Integer i:al)
		{
			result.add(i);
		}
		
		System.out.println("Sorted list: "+result);
		
		
		
		
		/*
		System.out.println("***********************************");
		
		ArrayList<String> als=new ArrayList<>();
		als.add("Sarika");
		als.add("Poonam");
		als.add("Amit");
		
		System.out.println("Total Element:"+als.size());
		System.out.println(als);
		
		System.out.println("***************************************");
			
		ArrayList<Double> ald=new ArrayList<>();
		if(ald.isEmpty())
		{
			ald.add(45.78);
			ald.add(99.87);
			
		}
		System.out.println("Total Elements: "+ald.size());
		System.out.println(ald);
		
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//Non generic   
		//1.not type safe   2.type casting required
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Sarang");
		al.add(89.89);
		al.add('W');
		
		System.out.println(al);
		int num=(int)al.get(0);
		System.out.println(num);
		
		*/
		

	}

}
