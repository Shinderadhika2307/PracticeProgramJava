package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_practice {

	public static void main(String[] args) {
		Vector V1=new Vector();
		V1.add(10);
		V1.add('e');
		V1.add("jjgh");
		V1.add(10.98);
		ListIterator i=V1.listIterator(); //ListIterator having previous method
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("=========for reverse=========");
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
