package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2
{
	//In arrayList we can add multiple null values

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(null);
		
		System.out.println("Total Elements are: "+al.size());
		
		//Iterate
		//1.for    2.for each     3.iterator()
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("******************");
		
		//for each
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("*******************");
		
		Iterator<Integer> ir=al.iterator();
		
		while(ir.hasNext())
		{
			Integer i=ir.next();
			System.out.println(i);
			//Validate
			if(i==40)
			{
				System.out.println("Element match! Test Pass");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
