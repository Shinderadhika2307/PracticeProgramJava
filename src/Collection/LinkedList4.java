//Reverse Elements of LinkedList
package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import Constructor.E;

public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(10);
		a.add("YYY");
		a.add('%');
		System.out.println(a);
		Collections.reverse(a);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
