package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm =new HashMap();
		hm.put(1,"hi");
		hm.put(3, null);
		//hm.put(2, "Hey");
		hm.put(2, "hey");
		hm.put(4, null);
		hm.put(5, "hi");
		System.out.println(hm);
		System.out.println("**********Using for loop");
		for(Integer Key:hm.keySet())
		{
		System.out.println(Key+" = "+hm.get(Key));	
		}
		System.out.println("**********Using iterator");
		System.out.println("First we require to convert into set");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
			
		
	}

}
//Hashmap store values in pairs i.e.keys & values
//one object is considered as key and another as values
//keys can be any type like integer, string
//values can be duplicate but key should be unique
//we use put method for adding elements