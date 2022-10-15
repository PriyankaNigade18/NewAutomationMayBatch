package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101,"C Programming");
		map.put(102,"C++" );
		map.put(103,"Java");
		map.put(104,"Python");
		map.put(103,"JavaScript");
		
		System.out.println(map);
		
		System.out.println(map.get(103));
		System.out.println("Total elements are:"+map.size());
		
		//For
		//Entry is interface  and entrySet()method which represent map.
		for(Map.Entry<Integer,String> i:map.entrySet())
		{
			System.out.println(i.getKey()+":"+i.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
