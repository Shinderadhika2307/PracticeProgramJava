package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("Bike");
		ll.add("Car");
		ll.add("Ambulance");
		ll.add("Bike");
		ll.add(null);
		System.out.println(ll);
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
//LinkedList can contain duplicate elements
//Linkedlist can maintain insersion order
//non synchronized
//Manipulation is fast because no shifting needs to occur.
